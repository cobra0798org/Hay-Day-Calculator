package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Animal", propOrder = {
        "name",
        "level",
        "cost",
        "product"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Animal implements HayDayXMLObject
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "level", required = true)
    protected ArrayList<Level> level;
    @XmlElement(name = "cost", required = true)
    protected ArrayList<Cost> cost;
    @XmlElement(name = "product", required = true)
    protected Product product;

    public String getName()
    {
        return name;
    }
    
    public ArrayList<Level> getLevels()
    {
        return level;
    }
    
    public ArrayList<Cost> getCosts()
    {
        return cost;
    }
    
    public Product getProduct()
    {
        return product;
    }
}
