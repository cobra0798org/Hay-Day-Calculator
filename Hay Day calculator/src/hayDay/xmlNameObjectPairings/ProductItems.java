package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.ProductItem;
import hayDay.xmlObjects.Requirement;

public class ProductItems
{
    private HayDayType hayDay;
    private ArrayList<Item> productItems;
    
    public ProductItems()
    {
        hayDay = HayDayAccessor.unmarshal();
        productItems = hayDay.getProductItems();
    }
    
    public ProductItems(HayDayType hayDay)
    {
        this.hayDay = hayDay;
        productItems = hayDay.getProductItems();
    }
    
    public LinkedHashMap<String, ProductItem> getProductItems()
    {
        LinkedHashMap<String, ProductItem> items = new LinkedHashMap<String, ProductItem>();
        for (Item item : productItems)
        {
            items.put(item.getName(), (ProductItem)item);
        }
        
        return items;
    }
    
    public LinkedHashMap<String, Double> getCostsForOne()
    {
        LinkedHashMap<String, Double> prices = new LinkedHashMap<String, Double>();
        for (Item item : productItems)
        {
            prices.put(item.getName(), item.getCostForOne());
        }
        
        return prices;
    }
    
    public LinkedHashMap<String, Double> getCostsForTen()
    {
        LinkedHashMap<String, Double> costsForTen = new LinkedHashMap<String, Double>();
        for (Item item : productItems)
        {
            costsForTen.put(item.getName(), item.getCostForTen());
        }
        
        return costsForTen;
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
    
    public LinkedHashMap<String, Integer> getLevels()
    {
        LinkedHashMap<String, Integer> levels = new LinkedHashMap<String, Integer>();
        for (Item item : productItems)
        {
            levels.put(item.getName(), item.getLevel());
        }
        
        return levels;
    }
    
    public LinkedHashMap<String, Integer> getTimes()
    {
        LinkedHashMap<String, Integer> times = new LinkedHashMap<String, Integer>();
        for (Item item : productItems)
        {
            times.put(item.getName(), item.getTime());
        }
        
        return times;
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
