package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;

public class RareItems extends Items
{
    private ArrayList<Item> rareItems;
    
    public RareItems(HayDayType hayDay)
    {
        super(hayDay.getRareItems());
        rareItems = hayDay.getRareItems();
    }
    
    @Override
    public LinkedHashMap<String, Item> getItems()
    {
        LinkedHashMap<String, Item> items = new LinkedHashMap<String, Item>();
        for (Item item : rareItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public Item getRareItem(String rareItemName)
    {
        LinkedHashMap<String, Item> items = getItems();
        return items.get(rareItemName);
    }
}
