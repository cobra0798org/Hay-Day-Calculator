package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Machine;
import hayDay.xmlObjects.ProductItem;

public class Machines
{
    private HayDayType hayDay;
    private ArrayList<Machine> machines;
    
    public Machines()
    {
        hayDay = HayDayAccessor.unmarshal();
        machines = hayDay.getMachines();
    }
    
    public Machines(HayDayType hayDay)
    {
        this.hayDay = hayDay;
        machines = hayDay.getMachines();
    }
    
    public LinkedHashMap<String, ArrayList<ProductItem>> getProducts()
    {
        LinkedHashMap<String, ArrayList<ProductItem>> products 
                = new LinkedHashMap<String, ArrayList<ProductItem>>();
        for (Machine machine : machines)
        {
            if (!machine.getName().equals("field"))
            {
                ArrayList<String> currentProducts = machine.getProducts();
                ArrayList<ProductItem> newProducts = getProductList(currentProducts);
                products.put(machine.getName(), newProducts);
            }
        }
        
        return products;
    }

    private ArrayList<ProductItem> getProductList(ArrayList<String> currentProducts)
    {
        ArrayList<ProductItem> products = new ArrayList<ProductItem>();
        ProductItems p = new ProductItems();
        LinkedHashMap<String, ProductItem> productItems = p.getProductItems();
        for (String s : currentProducts)
        {
            products.add(productItems.get(s));
        }
        return products;
    }
    
    public ArrayList<FarmItem> getFieldProductList(ArrayList<String> currentProducts)
    {
        ArrayList<FarmItem> products = new ArrayList<FarmItem>();
        FarmItems f = new FarmItems();
        LinkedHashMap<String, FarmItem> farmItems = f.getFarmItems();
        for (String s : currentProducts)
        {
            products.add(farmItems.get(s));
        }
        return products;
    }
}
