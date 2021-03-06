package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import hayDay.xmlObjects.Machine;
import hayDay.xmlObjects.Product;

public class Machines
{
    private static HayDayType hayDay = HayDayAccessor.newHayDayType();
    private ArrayList<Machine> machines;
    
    public Machines()
    {
        machines = hayDay.getMachines();
    }
    
    public Machine getMachine(String machineName)
    {
        for (Machine machine : machines)
        {
            if(machine.getName().equals(machineName))
            {
                return machine;
            }
        }
        return null;
    }
    
    public LinkedHashMap<String, ArrayList<Item>> getProducts()
    {
        LinkedHashMap<String, ArrayList<Item>> products 
                = new LinkedHashMap<String, ArrayList<Item>>();
        for (Machine machine : machines)
        {
            if (!machine.getName().equals("field"))
            {
                ArrayList<String> productNames = new ArrayList<String>();
                ArrayList<Product> currentProducts = machine.getProducts();
                for (Product product : currentProducts)
                {
                    productNames.add(product.getProduct().getName());
                }
                ArrayList<Item> newProducts = getProductList(productNames);
                products.put(machine.getName(), newProducts);
            }
        }
        
        return products;
    }

    private ArrayList<Item> getProductList(ArrayList<String> currentProducts)
    {
        ArrayList<Item> products = new ArrayList<Item>();
        ProductItems p = new ProductItems();
        LinkedHashMap<String, Item> productItems = p.getItems();
        for (String s : currentProducts)
        {
            products.add(productItems.get(s));
        }
        return products;
    }
    
    public ArrayList<Item> getFieldProductList(ArrayList<String> currentProducts)
    {
        ArrayList<Item> products = new ArrayList<Item>();
        FarmItems f = new FarmItems();
        LinkedHashMap<String, Item> farmItems = f.getItems();
        for (String s : currentProducts)
        {
            products.add(farmItems.get(s));
        }
        return products;
    }
}
