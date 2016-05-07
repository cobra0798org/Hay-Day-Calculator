package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.Item;

public abstract class Items
{
    private ArrayList<Item> items;
    
    public Items(ArrayList<Item> items)
    {
        this.items = items;
    }
    
    public abstract LinkedHashMap<String, Item> getItems();
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> costsForOne = new LinkedHashMap<String, Double>();
        for (Item item : items)
        {
            costsForOne.put(item.getName(), item.getCostForOne());
        }
        return costsForOne;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (Item item : items)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (Item item : items)
        {
            levels.put(item.getName(), item.getLevel());
        }
        return levels;
    }
    
    public LinkedHashMap<String, Integer> getTimes()
    {
        LinkedHashMap<String, Integer> times = new LinkedHashMap<String, Integer>();
        for (Item item : items)
        {
            times.put(item.getName(), item.getTime());
        }
        return times;
    }
}
