package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Requirement", propOrder = {
        "item",
        "count",
        "type"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Requirement extends ProductItem
{
    @XmlElement(name = "item", required = true)
    protected String item;
    @XmlElement(name = "count", required = true)
    protected int count;
    @XmlElement(name = "type", required = true)
    protected String type;
    
    public String getItem()
    {
        return item;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public String getType()
    {
        return type;
    }
}
