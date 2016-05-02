package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Requirement;

public class FarmItems
{
    private HayDayType hayDay;
    private ArrayList<FarmItem> farmItems;
    
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
        for (FarmItem item : farmItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (FarmItem item : farmItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (FarmItem item : farmItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getExps()
    {
        LinkedHashMap<String, Integer> exps = new LinkedHashMap<String, Integer>();
        for (FarmItem item : farmItems)
        {
            exps.put(item.getName(), item.getExp());
        }
        
        return exps;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (FarmItem item : farmItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
    
    public LinkedHashMap<String, Integer> getTimes()
    {
        LinkedHashMap<String, Integer> times = new LinkedHashMap<String, Integer>();
        for (FarmItem item : farmItems)
        {
            times.put(item.getName(), item.getTime());
        }
        
        return times;
    }
    
    public LinkedHashMap<String, ArrayList<Requirement>> getRequirements()
    {
        LinkedHashMap<String, ArrayList<Requirement>> requirements 
                = new LinkedHashMap<String, ArrayList<Requirement>>();
        for (FarmItem item : farmItems)
        {
            requirements.put(item.getName(), item.getRequirements());
        }
        
        return requirements;
    }
}
