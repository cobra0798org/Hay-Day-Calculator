package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.MineItem;

public class MineItems extends Items
{
    private ArrayList<Item> mineItems;
    
    public MineItems(HayDayType hayDay)
    {
        super(hayDay.getMineItems());
        mineItems = hayDay.getMineItems();
    }
    
    @Override
    public LinkedHashMap<String, Item> getItems()
    {
        LinkedHashMap<String, Item> items = new LinkedHashMap<String, Item>();
        for (Item item : mineItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public Item getMineItem(String mineItemName)
    {
        LinkedHashMap<String, Item> items = getItems();
        return items.get(mineItemName);
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
}
