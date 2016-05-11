package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.ProductItem;
import hayDay.xmlObjects.Requirement;

public class ProductItems extends Items
{
    private ArrayList<Item> productItems;
    private static HayDayType hayDay = HayDayAccessor.newHayDayType();
    
    public ProductItems()
    {
        super(hayDay.getProductItems());
        productItems = hayDay.getProductItems();
    }
    
    @Override
    public LinkedHashMap<String, Item> getItems()
    {
        LinkedHashMap<String, Item> items = new LinkedHashMap<String, Item>();
        for (Item item : productItems)
        {
            items.put(item.getName(), item);
        }
        
        return items;
    }
    
    public Item getProductItem(String productItemName)
    {
        LinkedHashMap<String, Item> items = getItems();
        Item item = items.get(productItemName);
        return item;
    }

    public LinkedHashMap<String, Integer> getExps()
    {
        LinkedHashMap<String, Integer> exps = new LinkedHashMap<String, Integer>();
        for (Item item : productItems)
        {
            exps.put(item.getName(), ((ProductItem)item).getExp());
        }
        
        return exps;
    }
    
    public LinkedHashMap<String, Integer> getMasteredTimes()
    {
        LinkedHashMap<String, Integer> masteredTimes = new LinkedHashMap<String, Integer>();
        for (Item item : productItems)
        {
            masteredTimes.put(item.getName(), ((ProductItem)item).getMasteredTime());
        }
        
        return masteredTimes;
    }
    
    public LinkedHashMap<String, ArrayList<Requirement>> getRequirements()
    {
        LinkedHashMap<String, ArrayList<Requirement>> requirements 
                = new LinkedHashMap<String, ArrayList<Requirement>>();
        for (Item item : productItems)
        {
            requirements.put(item.getName(), ((ProductItem)item).getRequirements());
        }
        
        return requirements;
    }
}
