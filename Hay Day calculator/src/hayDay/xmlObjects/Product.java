package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

import hayDay.xmlNameObjectPairings.HarvestItems;
import hayDay.xmlNameObjectPairings.ProductItems;

@XmlAccessorType(XmlAccessType.FIELD)
public class Product
{
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlValue
    protected String product;
    
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
    
    public Item getProduct(HayDayType hayDay)
    {
        Item item = null;
        if(getType().equals(ProductItem.class))
        {
            ProductItems p = new ProductItems(hayDay);
            item = p.getProductItem(product);
        }
        else if(getType().equals(HarvestItem.class))
        {
            HarvestItems h = new HarvestItems(hayDay);
            item = h.getHarvestItem(product);
        }
        return item;
    }

}
