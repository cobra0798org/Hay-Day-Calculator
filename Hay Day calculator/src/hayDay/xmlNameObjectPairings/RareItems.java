package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;

public class RareItems
{
    private HayDayType hayDay;
    private ArrayList<Item> rareItems;
    
    public RareItems()
    {
        hayDay = HayDayAccessor.unmarshal();
        rareItems = hayDay.getRareItems();
    }
    
    public RareItems(HayDayType hayDay)
    {
        this.hayDay = hayDay;
        rareItems = hayDay.getRareItems();
    }
    
    public LinkedHashMap<String, Item> getRareItems()
    {
        LinkedHashMap<String, Item> items = new LinkedHashMap<String, Item>();
        for (Item item : rareItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (Item item : rareItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (Item item : rareItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (Item item : rareItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
}
