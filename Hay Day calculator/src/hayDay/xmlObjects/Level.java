package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlType(name = "Level", propOrder = {
        "number",
        "level"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Level
{
    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlValue
    protected int level;
    
    public int getNumber()
    {
        return number;
    }
    
    public int getLevel()
    {
        return level;
    }
}
