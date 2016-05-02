package hayDay.xmlObjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory
{
    public final static QName _hayDay_QNAME = new QName("", "hayDay");
    public ObjectFactory()
    {
        
    }
    
    @XmlElementDecl(namespace = "", name = "hayDay")
    public JAXBElement<HayDayType> createHayDay(HayDayType value) 
    {
        return new JAXBElement<HayDayType>(_hayDay_QNAME, HayDayType.class, null, value);
    }
    
}
