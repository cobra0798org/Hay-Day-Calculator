package hayDay.xmlObjects;

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
    
    public Class<?> getType()
    {
        try
        {
            return Class.forName("hayDay.xmlObjects." + type);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public Item getItem(HayDayType hayDay)
    {
        Class<?> javaClass = getType();
        Item item;
        if(javaClass == ProductItem.class)
        {
            ProductItems p = new ProductItems(hayDay);
            item = p.getProductItem(this.item);
        }
        else if(javaClass == FarmItem.class)
        {
            FarmItems f = new FarmItems(hayDay);
            item = f.getFarmItem(this.item);
        }
        else if(javaClass == HarvestItem.class)
        {
            HarvestItems h = new HarvestItems(hayDay);
            item = h.getHarvestItem(this.item);
        }
        else if(javaClass == MineItem.class)
        {
            MineItems m = new MineItems(hayDay);
            item = m.getMineItem(this.item);
        }
        else if(javaClass == RareItem.class)
        {
            RareItems r = new RareItems(hayDay);
            item = r.getRareItem(this.item);
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
}
