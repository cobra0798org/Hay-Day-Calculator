package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Machine", propOrder = {
        "name",
        "level",
        "cost",
        "construction_time",
        "exp",
        "level_one_mastery_time",
        "level_two_mastery_time",
        "level_three_mastery_time",
        "product"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Machine extends HayDayType
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "level", required = true)
    protected int level;
    @XmlElement(name = "cost", required = true)
    protected int cost;
    @XmlElement(name = "construction_time", required = true)
    protected int construction_time;
    @XmlElement(name = "exp", required = true)
    protected int exp;
    @XmlElement(name = "level_one_mastery_time", required = true)
    protected int level_one_mastery_time;
    @XmlElement(name = "level_two_mastery_time", required = true)
    protected int level_two_mastery_time;
    @XmlElement(name = "level_three_mastery_time", required = true)
    protected int level_three_mastery_time;
    @XmlElement(name = "product", required = true)
    protected ArrayList<Product> product;
    
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public int getConstructionTime()
    {
        return construction_time;
    }
    
    public int getExp()
    {
        return exp;
    }
    
    public int getLevelOneMasteryTime()
    {
        return level_one_mastery_time;
    }
    
    public int getLevelTwoMasteryTime()
    {
        return level_two_mastery_time;
    }
    
    public int getLevelThreeMasteryTime()
    {
        return level_three_mastery_time;
    }
    
    public ArrayList<Product> getProducts()
    {
        return product;
    }
}
