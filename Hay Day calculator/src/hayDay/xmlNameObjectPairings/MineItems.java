package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.MineItem;

public class MineItems
{
    private ArrayList<Item> mineItems;

    
    public MineItems(HayDayType hayDay)
    {
        mineItems = hayDay.getMineItems();
    }
    
    public LinkedHashMap<String, MineItem> getMineItems()
    {
        LinkedHashMap<String, MineItem> items = new LinkedHashMap<String, MineItem>();
        for (Item item : mineItems)
        {
            items.put(item.getName(), (MineItem)item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (Item item : mineItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (Item item : mineItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getExps()
    {
        LinkedHashMap<String, Integer> exps = new LinkedHashMap<String, Integer>();
        for (Item item : mineItems)
        {
            exps.put(item.getName(), ((MineItem)item).getExp());
        }
        
        return exps;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (Item item : mineItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
}
