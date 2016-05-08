package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Source
{
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlValue
    protected String source;
    @XmlTransient
    private Class<?> classType;
    
    public Class<?> getType()
    {
        if(classType == null)
        {
            try
            {
                Class<?> c = Class.forName("hayDay.xmlObjects." + this.type);
                System.out.println(c);
                classType = c;
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        return classType;
    }
    
    public String getSource()
    {
        return this.source;
    }
}
