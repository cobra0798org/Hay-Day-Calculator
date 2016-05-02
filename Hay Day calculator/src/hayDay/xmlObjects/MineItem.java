package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MineItem", propOrder = {
        "name",
        "cost_for_one",
        "cost_for_ten",
        "level",
        "exp"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class MineItem implements Item
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "cost_for_one", required = true)
    protected double cost_for_one;
    @XmlElement(name = "cost_for_ten", required = true)
    protected double cost_for_ten;
    @XmlElement(name = "level", required = true)
    protected int level;
    @XmlElement(name = "exp", required = true)
    protected int exp;
    
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
    
    public int getExp()
    {
        return exp;
    }
    
    public int getTime()
    {
        return 0;
    }
}
