package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Product
{
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlValue
    protected String product;
    
    public Class<?> getType()
    {
        try
        {
            return Class.forName("hayDay.xmlObjects." + type);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public String getProductName()
    {
        return product;
    }

}
