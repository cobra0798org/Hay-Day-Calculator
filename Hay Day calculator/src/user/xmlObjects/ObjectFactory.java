package user.xmlObjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory
{
    public final static QName _user_QNAME = new QName("", "user");
    public ObjectFactory()
    {
        
    }
    
    @XmlElementDecl(namespace = "", name = "user")
    public JAXBElement<User> createUser(User value) 
    {
        return new JAXBElement<User>(_user_QNAME, User.class, null, value);
    }
    
}
