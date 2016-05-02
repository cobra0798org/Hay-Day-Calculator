package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product_item")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductItem implements Item
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "cost_for_one", required = true)
    protected double cost_for_one;
    @XmlElement(name = "cost_for_ten", required = true)
    protected double cost_for_ten;
    @XmlElement(required = true)
    protected int exp;
    @XmlElement(required = true)
    protected int time;
    @XmlElement(name = "mastered_time", required = true)
    protected int mastered_time;
    @XmlElement(name = "level", required = true)
    protected int level;
    @XmlElement(name = "requirement", required = true)
    protected ArrayList<Requirement> requirement;
    @XmlElement(name = "source", required = true)
    protected Source source;
    
    public String getName()
    {
        return name;
    }
    
    public double getCostForOne()
    {
        return this.cost_for_one;
    }
    
    public double getCostForTen()
    {
        return this.cost_for_ten;
    }
    
    public int getExp()
    {
        return this.exp;
    }
    
    /**
     * @return - time required to create the item in minutes
     */
    public int getTime()
    {
        return this.time;
    }
    
    /**
     * @return - time required to create the item after the machine is mastered in minutes
     */
    public int getMasteredTime()
    {
        return this.mastered_time;
    }
    
    public int getLevel()
    {
        return this.level;
    }
    
    public ArrayList<Requirement> getRequirements()
    {
        return this.requirement;
    }
    
    public Source getSource()
    {
        return this.source;
    }
}
