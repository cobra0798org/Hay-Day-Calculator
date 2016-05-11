package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Plant", propOrder = {
        "name",
        "total_lifespan",
        "cost",
        "total_exp",
        "gross_profit",
        "net_profit",
        "level"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Plant implements HayDayXMLObject
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "total_lifespan", required = true)
    protected int total_lifespan;
    @XmlElement(name = "cost", required = true)
    protected int cost;
    @XmlElement(name = "total_exp", required = true)
    protected int total_exp;
    @XmlElement(name = "gross_profit", required = true)
    protected int gross_profit;
    @XmlElement(name = "net_profit", required = true)
    protected int net_profit;
    @XmlElement(name = "level", required = true)
    protected int level;
    
    public String getName()
    {
        return name;
    }
    
    public int getTotalLifespan()
    {
        return total_lifespan;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public int getTotalExp()
    {
        return total_exp;
    }
    
    public int getGrossProfit()
    {
        return gross_profit;
    }
    
    public int getNetProfit()
    {
        return net_profit;
    }
    
    public int getLevel()
    {
        return level;
    }
}
