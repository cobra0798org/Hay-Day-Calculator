package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rare_item")
@XmlAccessorType(XmlAccessType.FIELD)
public class RareItem implements Item
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "cost_for_one", required = true)
    protected double cost_for_one;
    @XmlElement(name = "cost_for_ten", required = true)
    protected double cost_for_ten;
    @XmlElement(name = "level", required = true)
    protected int level;
    
    public String getName()
    {
        return name;
    }
    
    public double getCostForOne()
    {
        return cost_for_one;
    }
    
    public double getCostForTen()
    {
        return cost_for_ten;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public int getTime()
    {
        return 0;
    }
}
