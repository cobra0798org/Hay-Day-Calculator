package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Requirement;

public class FarmItems extends Items
{
    private ArrayList<Item> farmItems;
    
    public FarmItems(HayDayType hayDay)
    {
        super(hayDay.getFarmItems());
        farmItems = hayDay.getFarmItems();
    }
    
    @Override
    public LinkedHashMap<String, Item> getItems()
    {
        LinkedHashMap<String, Item> items = new LinkedHashMap<String, Item>();
        for (Item item : farmItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
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
