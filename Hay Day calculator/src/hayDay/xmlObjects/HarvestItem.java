package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "harvestItem", propOrder = {
        "name",
        "cost_for_one",
        "cost_for_ten",
        "exp",
        "time",
        "level",
        "requirement",
        "source"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class HarvestItem implements Item
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "cost_for_one", required = true)
    protected double cost_for_one;
    @XmlElement(name = "cost_for_ten", required = true)
    protected double cost_for_ten;
    @XmlElement(name = "exp", required = true)
    protected int exp;
    @XmlElement(name = "time", required = true)
    protected int time;
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
        return cost_for_one;
    }
    
    public double getCostForTen()
    {
        return cost_for_ten;
    }
    
    public int getExp()
    {
        return exp;
    }
    
    public int getTime()
    {
        return time;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public ArrayList<Requirement> getRequirements()
    {
        return requirement;
    }
    
    public Source getSource()
    {
        return source;
    }
}
