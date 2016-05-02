package user.xmlAccessors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import hayDay.xmlNameObjectPairings.HayDayAccessor;
import user.xmlObjects.ObjectFactory;
import user.xmlObjects.User;

public class UserAccessor
{
    public static User unmarshal(String user)
    {
        try
        {
            return jaxbUnmarshal(user);
        }
        catch (JAXBException je)
        {
            HayDayAccessor.JAXBExceptionCatch(je);
            return null;
        }
        catch (FileNotFoundException fe)
        {
            HayDayAccessor.genericExceptionCatch(fe);
            return null;
        }
    }
    
    public static boolean marshal(String user, User type)
    {
        try
        {
            jaxbMarshal(user, type);
            return true;
        }
        catch (JAXBException je)
        {
            HayDayAccessor.JAXBExceptionCatch(je);
            return false;
        }
    }
    
    @SuppressWarnings({ "resource", "rawtypes" })
    private static User jaxbUnmarshal(String username) throws JAXBException, FileNotFoundException
    {
        JAXBContext c = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller u = c.createUnmarshaller();
        FileInputStream xmlReader = new FileInputStream(new File("users/" + username + ".xml"));
        JAXBElement jaxbElement = (JAXBElement)u.unmarshal(xmlReader);
        User user = (User)jaxbElement.getValue();
        return user;
    }
    
    private static void jaxbMarshal(String username, User type) throws JAXBException
    {
        File xmlUserFile = new File("users/" + username + ".xml");
        JAXBContext context = JAXBContext.newInstance(User.class);
        Marshaller marshaller = context.createMarshaller();
        
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        marshaller.marshal(type, xmlUserFile);
    }
}
