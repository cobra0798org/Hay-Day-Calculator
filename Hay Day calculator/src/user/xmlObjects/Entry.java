package user.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import hayDay.xmlNameObjectPairings.FarmItems;
import hayDay.xmlNameObjectPairings.HarvestItems;
import hayDay.xmlNameObjectPairings.MineItems;
import hayDay.xmlNameObjectPairings.ProductItems;
import hayDay.xmlNameObjectPairings.RareItems;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entry", propOrder = {
        "name",
        "quantity",
        "type"
})
public class Entry
{
    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "quantity", required = true)
    protected int quantity;
    @XmlElement(name = "type", required = true)
    protected String type;
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public Item getType(HayDayType hayDay)
    {
        Item type = null;
        if(this.type.equals("product_item"))
        {
            ProductItems productItems = new ProductItems(hayDay);
            type = productItems.getProductItems().get(name);
        }
        else if(this.type.equals("farm_item"))
        {
            FarmItems farmItems = new FarmItems(hayDay);
            type = farmItems.getFarmItems().get(name);
        }
        else if(this.type.equals("harvest_item"))
        {
            HarvestItems harvestItems = new HarvestItems(hayDay);
            type = harvestItems.getHarvestItems().get(name);
        }
        else if(this.type.equals("rare_item"))
        {
            RareItems rareItems = new RareItems(hayDay);
            type = rareItems.getRareItems().get(name);
        }
        else if(this.type.equals("mine_item"))
        {
            MineItems mineItems = new MineItems(hayDay);
            type = mineItems.getMineItems().get(name);
        }
        return type;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
}