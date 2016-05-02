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
    @XmlElement(name = "product_item", required = true)
    protected ArrayList<ProductItem> product_item;
    @XmlElement(name = "farm_item", required = true)
    protected ArrayList<FarmItem> farm_item;
    @XmlElement(name = "harvest_item", required = true)
    protected ArrayList<HarvestItem> harvest_item;
    @XmlElement(name = "machine", required = true)
    protected ArrayList<Machine> machine;
    @XmlElement(name = "tree", required = true)
    protected ArrayList<Tree> tree;
    @XmlElement(name = "bush", required = true)
    protected ArrayList<Bush> bush;
    @XmlElement(name = "mine_item", required = true)
    protected ArrayList<MineItem> mine_item;
    @XmlElement(name = "voucher", required = true)
    protected ArrayList<String> voucher;
    @XmlElement(name = "animal", required = true)
    protected ArrayList<Animal> animal;
    @XmlElement(name = "rare_item", required = true)
    protected ArrayList<RareItem> rare_item;
    
    public ArrayList<ProductItem> getProductItems()
    {
        return this.product_item;
    }
    
    public ArrayList<FarmItem> getFarmItems()
    {
        return this.farm_item;
    }
    
    public ArrayList<HarvestItem> getHarvestItems()
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
    
    public ArrayList<MineItem> getMineItems()
    {
        return this.mine_item;
    }
    
    public ArrayList<String> getVouchers()
    {
        return this.voucher;
    }
    
    public ArrayList<Animal> getAnimals()
    {
        return this.animal;
    }
    
    public ArrayList<RareItem> getRareItems()
    {
        return rare_item;
    }
}
