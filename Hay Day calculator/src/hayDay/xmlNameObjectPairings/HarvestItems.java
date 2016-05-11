package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Requirement;

public class HarvestItems extends Items
{
    private ArrayList<Item> harvestItems;
    private static HayDayType hayDay = HayDayAccessor.newHayDayType();
    
    public HarvestItems()
    {
        super(hayDay.getHarvestItems());
        harvestItems = hayDay.getHarvestItems();
    }
    
    @Override
    public LinkedHashMap<String, Item> getItems()
    {
        LinkedHashMap<String, Item> items = new LinkedHashMap<String, Item>();
        for (Item item : harvestItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public Item getHarvestItem(String harvestItemName)
    {
        LinkedHashMap<String, Item> items = getItems();
        return items.get(harvestItemName);
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
