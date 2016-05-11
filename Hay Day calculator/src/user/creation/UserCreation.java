package user.creation;

import java.util.ArrayList;
import java.util.Scanner;

import hayDay.xmlObjects.Animal;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Machine;
import hayDay.xmlObjects.Plant;
import user.xmlObjects.Barn;
import user.xmlObjects.Entry;
import user.xmlObjects.Silo;
import user.xmlObjects.User;
import user.xmlObjects.UserAnimal;
import user.xmlObjects.UserAnimals;
import user.xmlObjects.UserMachine;
import user.xmlObjects.UserMachines;
import user.xmlObjects.UserPlant;
import user.xmlObjects.UserPlants;

public class UserCreation
{
    public static User newUser(HayDayType hayDay)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("what is the name of your farm? ");
        String name = input.next();
        User user = new User(name);
        
        System.out.println("what is your current level?");
        int level = input.nextInt();
        user.setLevel(level);
        
        System.out.println("how much exp do you have on your current level?");
        int expOnCurrentLevel = input.nextInt();
        user.setExpOnCurrentLevel(expOnCurrentLevel);
        
        createSilo(user, hayDay, input);
        createBarn(user, hayDay, input);
        createUserMachines(user, hayDay, input);
        createUserPlants(user, hayDay, input);
        createUserAnimals(user, hayDay, input);
        
        input.close();
        return user;
    }
    
    private static void createSilo(User user, HayDayType hayDay, Scanner input)
    {
        Silo userSilo = new Silo();
        ArrayList<Entry> siloEntries = new ArrayList<Entry>();
        System.out.println("what is the current max size of your silo?");
        int siloSize = input.nextInt();
        userSilo.setSiloSize(siloSize);
        for (Item farmItem : hayDay.getFarmItems())
        {
            if (!farmItem.getName().equals("none"))
            {
                Entry entry = new Entry();
                entry.setName(farmItem.getName());
                entry.setType("farm_item");
                
                System.out.println("how many " + farmItem.getName() + "s do you have in your silo?");
                int quantity = input.nextInt();
                entry.setQuantity(quantity);
                
                siloEntries.add(entry);
            }
        }
        userSilo.setEntries(siloEntries);
        user.setSilo(userSilo);
    }
    
    private static void createBarn(User user, HayDayType hayDay, Scanner input)
    {
        Barn userBarn = new Barn();
        ArrayList<Entry> barnEntries = new ArrayList<Entry>();
        System.out.println("what is the current max size of your barn?");
        int barnSize = input.nextInt();
        userBarn.setBarnSize(barnSize);
        createProductItems(barnEntries, hayDay, input);
        createHarvestItems(barnEntries, hayDay, input);
        createMineItems(barnEntries, hayDay, input);
        createRareItems(barnEntries, hayDay, input);
        userBarn.setEntries(barnEntries);
        user.setBarn(userBarn);
    }
    
    private static void createProductItems(ArrayList<Entry> barnEntries, HayDayType hayDay, Scanner input)
    {
        for (Item productItem : hayDay.getProductItems())
        {
            Entry entry = new Entry();
            entry.setName(productItem.getName());
            entry.setType("product_item");
            
            System.out.println("how many " + productItem.getName() + "s do you have in your barn?");
            int quantity = input.nextInt();
            entry.setQuantity(quantity);
            
            barnEntries.add(entry);
        }
    }
    
    private static void createHarvestItems(ArrayList<Entry> barnEntries, HayDayType hayDay, Scanner input)
    {
        for (Item harvestItem : hayDay.getHarvestItems())
        {
            Entry entry = new Entry();
            entry.setName(harvestItem.getName());
            entry.setType("harvest_item");
            
            System.out.println("how many " + harvestItem.getName() + "s do you have in your barn?");
            int quantity = input.nextInt();
            entry.setQuantity(quantity);
            
            barnEntries.add(entry);
        }
    }
    
    private static void createMineItems(ArrayList<Entry> barnEntries, HayDayType hayDay, Scanner input)
    {
        for (Item mineItem : hayDay.getMineItems())
        {
            Entry entry = new Entry();
            entry.setName(mineItem.getName());
            entry.setType("mine_item");
            
            System.out.println("how many " + mineItem.getName() + "s do you have in your barn?");
            int quantity = input.nextInt();
            entry.setQuantity(quantity);
            
            barnEntries.add(entry);
        }
    }
    
    private static void createRareItems(ArrayList<Entry> barnEntries, HayDayType hayDay, Scanner input)
    {
        for (Item rareItem : hayDay.getRareItems())
        {
            Entry entry = new Entry();
            entry.setName(rareItem.getName());
            entry.setType("rare_item");
            
            System.out.println("how many " + rareItem.getName() + "s do you have in your barn?");
            int quantity = input.nextInt();
            entry.setQuantity(quantity);
            
            barnEntries.add(entry);
        }
    }
    
    private static void createUserMachines(User user, HayDayType hayDay, Scanner input)
    {
        UserMachines userMachines = new UserMachines();
        ArrayList<UserMachine> machineEntries = new ArrayList<UserMachine>();
        for (Machine machine : hayDay.getMachines())
        {
            UserMachine userMachine = new UserMachine();
            userMachine.setName(machine.getName());
            
            System.out.println("how many " + machine.getName() + "s do you have?");
            int quantity = input.nextInt();
            userMachine.setQuantity(quantity);
            
            boolean isOwned = quantity > 0;
            userMachine.setOwned(isOwned);
            
            System.out.println("how many mastery stars do you have on that machine?");
            int masteryLevel = input.nextInt();
            userMachine.setMasteryLevel(masteryLevel);
            
            System.out.println("how many hours do you have towards your next mastery?");
            System.out.println("if fully mastered, enter -1.");
            int masteryHours = input.nextInt();
            userMachine.setMasteryHours(masteryHours);

            machineEntries.add(userMachine);
        }
        userMachines.setMachines(machineEntries);
        user.setMachines(userMachines);
    }
    
    private static void createUserPlants(User user, HayDayType hayDay, Scanner input)
    {
        UserPlants userPlants = new UserPlants();
        ArrayList<UserPlant> plantEntries = new ArrayList<UserPlant>();
        for (Plant plant : hayDay.getPlants())
        {
            UserPlant userPlant = new UserPlant();
            userPlant.setName(plant.getName());
            
            System.out.println("how many " + plant.getName() + "s do you have?");
            int quantity = input.nextInt();
            userPlant.setQuantity(quantity);
            
            System.out.println("at what stage of life are those plants in?");
            System.out.println("(harvest 2 = 1, harvest 3 = 2,"
                    + " harvest 4 /w help = 3, harvest 4 /wo help = 4)");
            int lifeCycleLevel = input.nextInt();
            userPlant.setLifeCycleLevel(lifeCycleLevel);
            
            plantEntries.add(userPlant);
        }
        userPlants.setPlants(plantEntries);
        user.setPlants(userPlants);
    }
    
    private static void createUserAnimals(User user, HayDayType hayDay, Scanner input)
    {
        UserAnimals userAnimals = new UserAnimals();
        ArrayList<UserAnimal> animalEntries = new ArrayList<UserAnimal>();
        for (Animal animal : hayDay.getAnimals())
        {
            UserAnimal userAnimal = new UserAnimal();
            userAnimal.setName(animal.getName());
            
            System.out.println("how many " + animal.getName() + "s do you have?");
            int quantity = input.nextInt();
            userAnimal.setQuantity(quantity);
            
            animalEntries.add(userAnimal);
        }
        userAnimals.setAnimals(animalEntries);
        user.setAnimals(userAnimals);
    }
}
