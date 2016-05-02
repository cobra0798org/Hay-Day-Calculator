package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Requirement;

public class FarmItems
{
    private HayDayType hayDay;
    private ArrayList<Item> farmItems;
    
    public FarmItems()
    {
        hayDay = HayDayAccessor.unmarshal();
        farmItems = hayDay.getFarmItems();
    }
    
    public FarmItems(HayDayType hayDay)
    {
        this.hayDay = hayDay;
        farmItems = hayDay.getFarmItems();
    }
    
    public LinkedHashMap<String, FarmItem> getFarmItems()
    {
        LinkedHashMap<String, FarmItem> items = new LinkedHashMap<String, FarmItem>();
        for (Item item : farmItems)
        {
            items.put(item.getName(), (FarmItem)item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (Item item : farmItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (Item item : farmItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getExps()
    {
        LinkedHashMap<String, Integer> exps = new LinkedHashMap<String, Integer>();
        for (Item item : farmItems)
        {
            exps.put(item.getName(), ((FarmItem)item).getExp());
        }
        
        return exps;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (Item item : farmItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
    
    public LinkedHashMap<String, Integer> getTimes()
    {
        LinkedHashMap<String, Integer> times = new LinkedHashMap<String, Integer>();
        for (Item item : farmItems)
        {
            times.put(item.getName(), item.getTime());
        }
        
        return times;
    }
    
    public LinkedHashMap<String, ArrayList<Requirement>> getRequirements()
    {
        LinkedHashMap<String, ArrayList<Requirement>> requirements 
                = new LinkedHashMap<String, ArrayList<Requirement>>();
        for (Item item : farmItems)
        {
            requirements.put(item.getName(), ((FarmItem)item).getRequirements());
        }
        
        return requirements;
    }
}
