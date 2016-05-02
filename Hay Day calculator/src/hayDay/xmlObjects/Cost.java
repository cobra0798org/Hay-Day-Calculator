package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlType(name = "Cost", propOrder = {
        "number",
        "cost"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Cost
{
    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlValue
    protected int cost;
    
    public int getNumber()
    {
        return number;
    }
    
    public int getCost()
    {
        return cost;
    }
}
