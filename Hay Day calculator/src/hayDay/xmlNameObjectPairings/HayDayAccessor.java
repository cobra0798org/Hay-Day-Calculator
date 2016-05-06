package hayDay.xmlNameObjectPairings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.MineItem;
import hayDay.xmlObjects.ProductItem;
import hayDay.xmlObjects.RareItem;

public class HayDayAccessor
{
    public static HayDayType unmarshal(String dataFileName)
    {
        HayDayType hayDay = null;
        try
        {
            hayDay = xmlAccess(dataFileName);
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
    
    @SuppressWarnings({"resource" })
    private static HayDayType xmlAccess(String dataFileName) throws JAXBException, FileNotFoundException
    {
        JAXBContext jc = JAXBContext.newInstance(HayDayType.class, 
                FarmItem.class, ProductItem.class,
                HarvestItem.class, RareItem.class, MineItem.class);
        Unmarshaller u = jc.createUnmarshaller();
        FileInputStream poFIO = new FileInputStream(dataFileName);
        HayDayType poe = (HayDayType)u.unmarshal(poFIO);
        return poe;
    }
}
