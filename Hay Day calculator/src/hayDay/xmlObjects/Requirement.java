package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import hayDay.xmlNameObjectPairings.Animals;
import hayDay.xmlNameObjectPairings.Bushes;
import hayDay.xmlNameObjectPairings.FarmItems;
import hayDay.xmlNameObjectPairings.HarvestItems;
import hayDay.xmlNameObjectPairings.HayDayAccessor;
import hayDay.xmlNameObjectPairings.MineItems;
import hayDay.xmlNameObjectPairings.ProductItems;
import hayDay.xmlNameObjectPairings.RareItems;
import hayDay.xmlNameObjectPairings.Trees;

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
    
    public HayDayXMLObject getItem()
    {
        Class<?> javaClass = getType();
        HayDayXMLObject item = null;
        HayDayType hayDay = HayDayAccessor.newHayDayType();
        
        if(javaClass == ProductItem.class)
        {
            ProductItems p = new ProductItems();
            item = p.getProductItem(this.item);
        }
        else if(javaClass == FarmItem.class)
        {
            FarmItems f = new FarmItems();
            item = f.getFarmItem(this.item);
        }
        else if(javaClass == HarvestItem.class)
        {
            HarvestItems h = new HarvestItems();
            item = h.getHarvestItem(this.item);
        }
        else if(javaClass == MineItem.class)
        {
            MineItems m = new MineItems();
            item = m.getMineItem(this.item);
        }
        else if(javaClass == RareItem.class)
        {
            RareItems r = new RareItems();
            item = r.getRareItem(this.item);
        }
        else if(javaClass == Animal.class)
        {
            Animals r = new Animals();
            item = r.getAnimal(this.item);
        }
        else if(javaClass == Tree.class)
        {
            Trees r = new Trees();
            item = r.getTree(this.item);
        }
        else if(javaClass == Bush.class)
        {
            Bushes r = new Bushes();
            item = r.getBush(this.item);
        }
        else if(javaClass == Voucher.class)
        {
            ArrayList<Voucher> vouchers = hayDay.getVouchers();
            for (Voucher voucher : vouchers)
            {
                if (voucher.getName().equals(this.item))
                {
                    item = voucher;
                }
            }
        }
        return item;
    }
    
    public int getCount()
    {
        return count;
    }
}
