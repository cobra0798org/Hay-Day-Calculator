package debug;

import java.util.ArrayList;

import exceptions.ProducableException;
import hayDay.xmlObjects.Animal;
import hayDay.xmlObjects.Cost;
import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Level;
import hayDay.xmlObjects.Machine;
import hayDay.xmlObjects.MineItem;
import hayDay.xmlObjects.Plant;
import hayDay.xmlObjects.Product;
import hayDay.xmlObjects.ProductItem;
import hayDay.xmlObjects.RareItem;
import hayDay.xmlObjects.Requirement;
import hayDay.xmlObjects.Source;
import user.xmlAccessors.UserAccessor;
import user.xmlObjects.User;
import user.xmlObjects.UserPlant;

public class PrintTests
{
    private static User user = UserAccessor.unmarshal("GreenEggsAndHam");
    public static void printProductItemTests(ArrayList<Item> list)
    {
        System.out.println("***PRODUCT ITEMS***");
        for(Item item : list)
        {
            ProductItem productItem = (ProductItem)item;
            System.out.println("NAME: " + productItem.getName());
            System.out.println("COST FOR ONE: " + productItem.getCostForOne());
            System.out.println("COST FOR TEN: " + productItem.getCostForTen());
            System.out.println("EXP: " + productItem.getExp());
            System.out.println("TIME: " + productItem.getTime());
            int totalTime = 0;
            try
            {
                totalTime = productItem.getTotalTime(user, true, 1);
            }
            catch (ProducableException e)
            {
                e.printStackTrace();
            }
            System.out.println("TOTAL TIME: " + totalTime);
            System.out.println("MASTERED TIME: " + productItem.getMasteredTime());
            System.out.println("LEVEL: " + productItem.getLevel());
            
            printRequirementTests(productItem.getRequirements());
            
            printSourceTests(productItem.getSource());
            
            System.out.println();
            System.out.println("********************");
            System.out.println();
        }
    }
    
    public static void printAnimalTests(ArrayList<Animal> animals)
    {
        System.out.println("***ANIMALS***");
        for(Animal animal : animals)
        {
            ArrayList<Level> levels = animal.getLevels();
            ArrayList<Cost> costs = animal.getCosts();
            Product product = animal.getProduct();
            boolean isCostsGreater = false;
            
            if (costs.size() > levels.size())
            {
                for (int i = 0; i < costs.size() - 1; i++)
                {
                    levels.add(levels.get(levels.size() - 1));
                }
                isCostsGreater = true;
            }
            else if (levels.size() > costs.size())
            {
                for (int i = 0; i < levels.size() - 1; i++)
                {
                    costs.add(costs.get(costs.size() - 1));
                }
            }

            System.out.println("NAME: " + animal.getName());
            for (int i =  0; i < levels.size(); i++)
            {
                if (isCostsGreater)
                {
                    System.out.println("\tRANK # " + costs.get(i).getNumber());
                }
                else
                {
                    System.out.println("\tRANK # " + levels.get(i).getNumber());
                }
                System.out.println("\t\tLEVEL: " + levels.get(i).getLevel());
                System.out.println("\t\tCOST: " + costs.get(i).getCost());
            }
            System.out.println("\tPRODUCT: " + product.getProduct().getName());
            System.out.println();
            System.out.println();
        }
    }
    
    public static void printFarmItemTests(ArrayList<Item> farmItems)
    {
        System.out.println("***FARM ITEMS***");
        for(Item item : farmItems)
        {
            FarmItem farmItem = (FarmItem)item;
            System.out.println("NAME: " + farmItem.getName());
            System.out.println("COST FOR ONE: " + farmItem.getCostForOne());
            System.out.println("COST FOR TEN: " + farmItem.getCostForTen());
            System.out.println("EXP: " + farmItem.getExp());
            System.out.println("TIME: " + farmItem.getTime());
            int totalTime = 0;
            try
            {
                totalTime = farmItem.getTotalTime(user, true, 1);
            }
            catch (ProducableException e)
            {
                e.printStackTrace();
            }
            System.out.println("TOTAL TIME: " + totalTime);
            System.out.println("LEVEL: " + farmItem.getLevel());
            
            printRequirementTests(farmItem.getRequirements());
            
            printSourceTests(farmItem.getSource());
            System.out.println();
            System.out.println("********************");
            System.out.println();
        }
    }
    
    public static void printHarvestItemTests(ArrayList<Item> harvestItems)
    {
        System.out.println("***HARVEST ITEMS***");
        for(Item item : harvestItems)
        {
            HarvestItem harvestItem = (HarvestItem)item;
            System.out.println("NAME: " + harvestItem.getName());
            System.out.println("COST FOR ONE: " + harvestItem.getCostForOne());
            System.out.println("COST FOR TEN: " + harvestItem.getCostForTen());
            System.out.println("EXP: " + harvestItem.getExp());
            System.out.println("TIME: " + harvestItem.getTime());
            int totalTime = 0;
            try
            {
                totalTime = harvestItem.getTotalTime(user, true, 1);
            }
            catch (ProducableException e)
            {
                e.printStackTrace();
            }
            System.out.println("TOTAL TIME: " + totalTime);
            System.out.println("LEVEL: " + harvestItem.getLevel());
            
            printRequirementTests(harvestItem.getRequirements());
            
            printSourceTests(harvestItem.getSource());
            System.out.println();
            System.out.println("********************");
            System.out.println();
        }
    }
    
    public static void printMachineTests(ArrayList<Machine> machines)
    {
        System.out.println("***MACHINES***");
        for(Machine machine : machines)
        {
            if(!machine.getName().equals("field"))
            {
                System.out.println("NAME: " + machine.getName());
                System.out.println("LEVEL: " + machine.getLevel());
                System.out.println("COST: " + machine.getCost());
                System.out.println("CONSTRUCTION TIME: " + machine.getConstructionTime());
                System.out.println("EXP: " + machine.getExp());
                System.out.println("LEVEL ONE MASTERY TIME: " + machine.getLevelOneMasteryTime());
                System.out.println("LEVEL TWO MASTERY TIME: " + machine.getLevelTwoMasteryTime());
                System.out.println("LEVEL THREE MASTERY TIME: " + machine.getLevelThreeMasteryTime());
                
                ArrayList<Product> products = machine.getProducts();
                printProductTests(products);
                
                System.out.println("********************");
                System.out.println();
            }
        }
    }
    
    public static void printPlantTests(ArrayList<Plant> plants)
    {
        System.out.println("***PLANTS***");
        for (Plant plant : plants)
        {
            System.out.println("NAME: " + plant.getName());
            System.out.println("TOTAL LIFESPAN: " + plant.getTotalLifespan());
            System.out.println("COST: " + plant.getCost());
            System.out.println("TOTAL EXP: " + plant.getTotalExp());
            System.out.println("GROSS PROFIT: " + plant.getGrossProfit());
            System.out.println("NET PROFIT: " + plant.getNetProfit());
            System.out.println("LEVEL: " + plant.getLevel());
        }
    }
    
    public static void printMineItemTests(ArrayList<Item> mineItems)
    {
        System.out.println("***MINE ITEMS***");
        for (Item item : mineItems)
        {
            MineItem mineItem = (MineItem)item;
            System.out.println("NAME: " + mineItem.getName());
            System.out.println("COST FOR ONE: " + mineItem.getCostForOne());
            System.out.println("COST FOR TEN: " + mineItem.getCostForTen());
            System.out.println("EXP: " + mineItem.getExp());
            System.out.println("LEVEL: " + mineItem.getLevel());
            System.out.println("TIME: " + mineItem.getTime());
            int totalTime = 0;
            try
            {
                totalTime = mineItem.getTotalTime(user, true, 1);
            }
            catch (ProducableException e)
            {
                e.printStackTrace();
            }
            System.out.println("TOTAL TIME: " + totalTime);
        }
    }
    
    public static void printRequirementTests(ArrayList<Requirement> requirements)
    {
        System.out.println("***REQUIREMENTS***");
        for(Requirement requirement : requirements)
        {
            System.out.println("\tNAME: " + requirement.getItem().getName());
            System.out.println("\tCOUNT: " + requirement.getCount());
            System.out.println("\tTYPE: " + requirement.getType());
            System.out.println();
        }
    }
    
    public static void printSourceTests(Source source)
    {
        System.out.println("***SOURCE***");
        Class<?> sourceType = source.getType();
        System.out.println("SOURCE: " + source.getSource().getName());
        System.out.println("\tSOURCE TYPE: " + sourceType);
    }
    
    public static void printProductTests(ArrayList<Product> products)
    {
        System.out.println("***PRODUCTS***");
        for (Product product : products)
        {
            System.out.println("\tPRODUCT: " + product.getProduct().getName());
        }
    }
    
    public static void printRareItemTests(ArrayList<Item> rareItems)
    {
        System.out.println("***RARE ITEMS***");
        for (Item item : rareItems)
        {
            RareItem rareItem = (RareItem)item;
            System.out.println("NAME: " + rareItem.getName());
            System.out.println("COST FOR ONE: " + rareItem.getCostForOne());
            System.out.println("COST FOR TEN: " + rareItem.getCostForTen());
            System.out.println("LEVEL: " + rareItem.getLevel());
            System.out.println("TIME: " + rareItem.getTime());
            int totalTime = 0;
            try
            {
                totalTime = rareItem.getTotalTime(user, true, 1);
            }
            catch (ProducableException e)
            {
                e.printStackTrace();
            }
            System.out.println("TOTAL TIME: " + totalTime);
        }
    }
    
    public static void printUserPlantTests(ArrayList<UserPlant> userPlants)
    {
        System.out.println("***USER PLANTS***");
        for (UserPlant userPlant : userPlants)
        {
            System.out.println("NAME: " + userPlant.getName());
            System.out.println("QUANTITY: " + userPlant.getQuantity());
            System.out.println("LIFE CYCLE LEVEL: " + userPlant.getLifeCycleLevel());
        }
    }
}
