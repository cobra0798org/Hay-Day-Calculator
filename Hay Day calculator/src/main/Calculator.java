package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import hayDay.xmlObjects.Item;

public class Calculator
{
    public Calculator()
    {
        
    }
    public double calculateSum(HashMap<Item, Integer> barnItems)
    {
        System.out.println("size: " + barnItems.size());
        double totalCost = 0;
        Iterator<Entry<Item, Integer>> it = barnItems.entrySet().iterator();
        while(it.hasNext())
        {
            Entry<Item, Integer> pair = it.next();
            double cost = pair.getKey().getCostForTen()/10.0;
            double quantity = pair.getValue();
            System.out.println(pair.getKey().getName() + ": " + cost * quantity);
            totalCost += cost * quantity;
        }
        return totalCost;
    }
}
