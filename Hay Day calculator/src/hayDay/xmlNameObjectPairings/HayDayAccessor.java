package hayDay.xmlNameObjectPairings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.ObjectFactory;

public class HayDayAccessor
{
    public static HayDayType unmarshal()
    {
        HayDayType hayDay = null;
        try
        {
            hayDay = xmlAccess();
        }
        catch(JAXBException je)
        {
            JAXBExceptionCatch(je);
        }
        catch (FileNotFoundException fe)
        {
            genericExceptionCatch(fe);
        }
        return hayDay;
    }
    
    public static void JAXBExceptionCatch(JAXBException je)
    {
        System.err.println(je.getErrorCode());
        je.printStackTrace();
    }
    
    public static void genericExceptionCatch(Exception e)
    {
        e.printStackTrace();
    }
    
    @SuppressWarnings({ "rawtypes", "resource" })
    private static HayDayType xmlAccess() throws JAXBException, FileNotFoundException
    {
        JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller u = jc.createUnmarshaller();
        FileInputStream poFIO = new FileInputStream("Data/data.xml");
        JAXBElement poe = (JAXBElement)u.unmarshal(poFIO);
        return (HayDayType)poe.getValue();
    }
}
