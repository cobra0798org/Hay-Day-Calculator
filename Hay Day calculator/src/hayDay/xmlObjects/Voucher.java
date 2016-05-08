package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voucher", propOrder = {
        "name"
})
public class Voucher implements HayDayXMLObject
{
    @XmlElement(name = "name", required = true)
    protected String name;
    
    public Voucher()
    {
        
    }
    
    public String getName()
    {
        return name;
    }
}
