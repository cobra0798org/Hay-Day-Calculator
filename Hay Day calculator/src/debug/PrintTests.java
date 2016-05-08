package debug;

import java.util.ArrayList;

import hayDay.xmlNameObjectPairings.HayDayAccessor;
import hayDay.xmlObjects.Animal;
import hayDay.xmlObjects.Bush;
import hayDay.xmlObjects.Cost;
import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Level;
import hayDay.xmlObjects.Machine;
import hayDay.xmlObjects.MineItem;
import hayDay.xmlObjects.Product;
import hayDay.xmlObjects.ProductItem;
import hayDay.xmlObjects.RareItem;
import hayDay.xmlObjects.Requirement;
import hayDay.xmlObjects.Source;
import hayDay.xmlObjects.Tree;
import main.HayDayCalculator;

public class PrintTests
{
    private static HayDayType hayDay = HayDayAccessor.unmarshal(HayDayCalculator.DATAFILENAME);
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
            System.out.println("\tPRODUCT: " + product.getProductName());
            System.out.println();
            System.out.println();
        }
    }
    
    public static void printFarmItemTests(ArrayList<Item> farmItems)
    {
        System.out.println("***PRODUCT ITEMS***");
        for(Item item : farmItems)
        {
            FarmItem farmItem = (FarmItem)item;
            System.out.println("NAME: " + farmItem.getName());
            System.out.println("COST FOR ONE: " + farmItem.getCostForOne());
            System.out.println("COST FOR TEN: " + farmItem.getCostForTen());
            System.out.println("EXP: " + farmItem.getExp());
            System.out.println("TIME: " + farmItem.getTime());
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
        System.out.println("***PRODUCT ITEMS***");
        for(Item item : harvestItems)
        {
            HarvestItem harvestItem = (HarvestItem)item;
            System.out.println("NAME: " + harvestItem.getName());
            System.out.println("COST FOR ONE: " + harvestItem.getCostForOne());
            System.out.println("COST FOR TEN: " + harvestItem.getCostForTen());
            System.out.println("EXP: " + harvestItem.getExp());
            System.out.println("TIME: " + harvestItem.getTime());
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
        for(Machine machine : machines)
        {
            System.out.println("***MACHINES***");
            System.out.println("NAME: ");
            System.out.println("LEVEL: ");
            System.out.println("COST: ");
            System.out.println("CONSTRUCTION TIME: ");
            System.out.println("EXP: ");
            System.out.println("LEVEL ONE MASTERY TIME: ");
            System.out.println("LEVEL TWO MASTERY TIME: ");
            System.out.println("LEVEL THREE MASTERY TIME: ");
            
            printProductTests(machine.getProducts());
            
            System.out.println("********************");
            System.out.println();
        }
    }
    
    public static void printTreeTests(ArrayList<Tree> trees)
    {
        for (Tree tree : trees)
        {
            System.out.println("NAME: " + tree.getName());
            System.out.println("TOTAL LIFESPAN: " + tree.getTotalLifespan());
            System.out.println("COST: " + tree.getCost());
            System.out.println("TOTAL EXP: " + tree.getTotalExp());
            System.out.println("GROSS PROFIT: " + tree.getGrossProfit());
            System.out.println("NET PROFIT: " + tree.getNetProfit());
            System.out.println("LEVEL: " + tree.getLevel());
        }
    }
    
    public static void printBushTests(ArrayList<Bush> bushes)
    {
        for (Bush bush : bushes)
        {
            System.out.println("NAME: " + bush.getName());
            System.out.println("TOTAL LIFESPAN: " + bush.getTotalLifespan());
            System.out.println("COST: " + bush.getCost());
            System.out.println("TOTAL EXP: " + bush.getTotalExp());
            System.out.println("GROSS PROFIT: " + bush.getGrossProfit());
            System.out.println("NET PROFIT: " + bush.getNetProfit());
            System.out.println("LEVEL: " + bush.getLevel());
        }
    }
    
    public static void printMineItemTests(ArrayList<Item> mineItems)
    {
        for (Item item : mineItems)
        {
            MineItem mineItem = (MineItem)item;
            System.out.println("NAME: " + mineItem.getName());
            System.out.println("COST FOR ONE: " + mineItem.getCostForOne());
            System.out.println("COST FOR TEN: " + mineItem.getCostForTen());
            System.out.println("EXP: " + mineItem.getExp());
            System.out.println("LEVEL: " + mineItem.getLevel());
            System.out.println("TIME: " + mineItem.getTime());
        }
    }
    
    public static void printRequirementTests(ArrayList<Requirement> requirements)
    {
        System.out.println("***REQUIREMENTS***");
        for(Requirement requirement : requirements)
        {
            System.out.println("\tNAME: " + requirement.getItem(hayDay).getName());
            System.out.println("\tCOUNT: " + requirement.getCount());
            System.out.println("\tTYPE: " + requirement.getType());
            System.out.println();
        }
    }
    
    public static void printSourceTests(Source source)
    {
        System.out.println("SOURCE: " + source.getSource());
        System.out.println("\tSOURCE TYPE: " + source.getType());
    }
    
    public static void printProductTests(ArrayList<String> products)
    {
        System.out.println("***PRODUCTS***");
        for (String product : products)
        {
            System.out.println("\tPRODUCT: " + product);
        }
    }
    
    public static void printRareItemTests(ArrayList<Item> rareItems)
    {
        for (Item item : rareItems)
        {
            RareItem rareItem = (RareItem)item;
            System.out.println("NAME: " + rareItem.getName());
            System.out.println("COST FOR ONE: " + rareItem.getCostForOne());
            System.out.println("COST FOR TEN: " + rareItem.getCostForTen());
            System.out.println("LEVEL: " + rareItem.getLevel());
            System.out.println("TIME: " + rareItem.getTime());
        }
    }
}
