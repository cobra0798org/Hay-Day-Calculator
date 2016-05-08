package hayDay.xmlObjects;

import java.util.LinkedHashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import hayDay.xmlNameObjectPairings.FarmItems;
import hayDay.xmlNameObjectPairings.HarvestItems;
import hayDay.xmlNameObjectPairings.MineItems;
import hayDay.xmlNameObjectPairings.ProductItems;
import hayDay.xmlNameObjectPairings.RareItems;

@XmlType(name = "Requirement", propOrder = {
        "item",
        "count",
        "type"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Requirement 
{
    @XmlElement(name = "item", required = true)
    protected String item;
    @XmlElement(name = "count", required = true)
    protected int count;
    @XmlElement(name = "type", required = true)
    protected String type;
    
    public Item getItem(HayDayType hayDay)
    {
        LinkedHashMap<String, Item> p = new ProductItems(hayDay).getItems();
        LinkedHashMap<String, Item> f = new FarmItems(hayDay).getItems();
        LinkedHashMap<String, Item> h = new HarvestItems(hayDay).getItems();
        LinkedHashMap<String, Item> m = new MineItems(hayDay).getItems();
        LinkedHashMap<String, Item> r = new RareItems(hayDay).getItems();
        Item item;
        if(p.containsKey(this.item))
        {
            item = p.get(this.item);
        }
        else if(f.containsKey(this.item))
        {
            item = f.get(this.item);
        }
        else if(h.containsKey(this.item))
        {
            item = h.get(this.item);
        }
        else if(m.containsKey(this.item))
        {
            item = m.get(this.item);
        }
        else if(r.containsKey(this.item))
        {
            item = r.get(this.item);
        }
        else
        {
            item = null;
        }
        return item;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public String getType()
    {
        return type;
    }
}
