package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Requirement;

public class HarvestItems
{
    private ArrayList<Item> harvestItems;
    
    public HarvestItems(HayDayType hayDay)
    {
        harvestItems = hayDay.getHarvestItems();
    }
    
    public LinkedHashMap<String, HarvestItem> getHarvestItems()
    {
        LinkedHashMap<String, HarvestItem> items = new LinkedHashMap<String, HarvestItem>();
        for (Item item : harvestItems)
        {
            items.put(item.getName(), (HarvestItem)item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (Item item : harvestItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (Item item : harvestItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getExps()
    {
        LinkedHashMap<String, Integer> exps = new LinkedHashMap<String, Integer>();
        for (Item item : harvestItems)
        {
            exps.put(item.getName(), ((HarvestItem)item).getExp());
        }
        
        return exps;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (Item item : harvestItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
    
    public LinkedHashMap<String, Integer> getTimes()
    {
        LinkedHashMap<String, Integer> times = new LinkedHashMap<String, Integer>();
        for (Item item : harvestItems)
        {
            times.put(item.getName(), item.getTime());
        }
        
        return times;
    }
    
    public LinkedHashMap<String, ArrayList<Requirement>> getRequirements()
    {
        LinkedHashMap<String, ArrayList<Requirement>> requirements 
                = new LinkedHashMap<String, ArrayList<Requirement>>();
        for (Item item : harvestItems)
        {
            requirements.put(item.getName(), ((HarvestItem)item).getRequirements());
        }
        
        return requirements;
    }
}
