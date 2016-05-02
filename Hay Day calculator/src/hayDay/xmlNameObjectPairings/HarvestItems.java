package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Requirement;

public class HarvestItems
{
    private HayDayType hayDay;
    private ArrayList<HarvestItem> harvestItems;
    
    public HarvestItems()
    {
        hayDay = HayDayAccessor.unmarshal();
        harvestItems = hayDay.getHarvestItems();
    }
    
    public HarvestItems(HayDayType hayDay)
    {
        this.hayDay = hayDay;
        harvestItems = hayDay.getHarvestItems();
    }
    
    public LinkedHashMap<String, HarvestItem> getHarvestItems()
    {
        LinkedHashMap<String, HarvestItem> items = new LinkedHashMap<String, HarvestItem>();
        for (HarvestItem item : harvestItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (HarvestItem item : harvestItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (HarvestItem item : harvestItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
    }
    
    public LinkedHashMap<String, Integer> getExps()
    {
        LinkedHashMap<String, Integer> exps = new LinkedHashMap<String, Integer>();
        for (HarvestItem item : harvestItems)
        {
            exps.put(item.getName(), item.getExp());
        }
        
        return exps;
    }
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (HarvestItem item : harvestItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
    
    public LinkedHashMap<String, Integer> getTimes()
    {
        LinkedHashMap<String, Integer> times = new LinkedHashMap<String, Integer>();
        for (HarvestItem item : harvestItems)
        {
            times.put(item.getName(), item.getTime());
        }
        
        return times;
    }
    
    public LinkedHashMap<String, ArrayList<Requirement>> getRequirements()
    {
        LinkedHashMap<String, ArrayList<Requirement>> requirements 
                = new LinkedHashMap<String, ArrayList<Requirement>>();
        for (HarvestItem item : harvestItems)
        {
            requirements.put(item.getName(), item.getRequirements());
        }
        
        return requirements;
    }
}
