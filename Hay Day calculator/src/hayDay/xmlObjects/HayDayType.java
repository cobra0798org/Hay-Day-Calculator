package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "hayDayType", propOrder = {
    "product_item",
    "farm_item",
    "harvest_item",
    "machine",
    "tree",
    "bush",
    "mine_item",
    "voucher",
    "animal",
    "rare_item"
})
@XmlRootElement(name = "hayDay")
@XmlAccessorType(XmlAccessType.FIELD)
public class HayDayType extends ObjectFactory
{
    @XmlElement(type = ProductItem.class, name = "product_item", required = true)
    protected ArrayList<Item> product_item;
    @XmlElement(type = FarmItem.class, name = "farm_item", required = true)
    protected ArrayList<Item> farm_item;
    @XmlElement(type = HarvestItem.class, name = "harvest_item", required = true)
    protected ArrayList<Item> harvest_item;
    @XmlElement(name = "machine", required = true)
    protected ArrayList<Machine> machine;
    @XmlElement(name = "tree", required = true)
    protected ArrayList<Tree> tree;
    @XmlElement(name = "bush", required = true)
    protected ArrayList<Bush> bush;
    @XmlElement(type = MineItem.class, name = "mine_item", required = true)
    protected ArrayList<Item> mine_item;
    @XmlElement(name = "voucher", required = true)
    protected ArrayList<Voucher> voucher;
    @XmlElement(name = "animal", required = true)
    protected ArrayList<Animal> animal;
    @XmlElement(type = RareItem.class, name = "rare_item", required = true)
    protected ArrayList<Item> rare_item;
    
    public ArrayList<Item> getProductItems()
    {
        return this.product_item;
    }
    
    public ArrayList<Item> getFarmItems()
    {
        return this.farm_item;
    }
    
    public ArrayList<Item> getHarvestItems()
    {
        return this.harvest_item;
    }
    
    public ArrayList<Machine> getMachines()
    {
        return this.machine;
    }
    
    public ArrayList<Tree> getTrees()
    {
        return this.tree;
    }
    
    public ArrayList<Bush> getBushes()
    {
        return this.bush;
    }
    
    public ArrayList<Item> getMineItems()
    {
        return this.mine_item;
    }
    
    public ArrayList<Voucher> getVouchers()
    {
        return this.voucher;
    }
    
    public ArrayList<Animal> getAnimals()
    {
        return this.animal;
    }
    
    public ArrayList<Item> getRareItems()
    {
        return rare_item;
    }
}
