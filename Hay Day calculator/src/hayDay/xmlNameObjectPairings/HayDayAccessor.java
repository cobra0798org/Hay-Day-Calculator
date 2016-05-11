package hayDay.xmlNameObjectPairings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import hayDay.xmlObjects.FarmItem;
import hayDay.xmlObjects.HarvestItem;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.MineItem;
import hayDay.xmlObjects.ProductItem;
import hayDay.xmlObjects.RareItem;

public class HayDayAccessor implements Serializable
{
    private static final long serialVersionUID = -3416877414983169159L;
    private static HayDayType hayDay = null;

    private HayDayAccessor(){}

    public static HayDayType newHayDayType()
    {
        if(hayDay == null)
        {
            try
            {
                hayDay = unmarshal("Data/data.xml");
            }
            catch(JAXBException je)
            {
                JAXBExceptionCatch(je);
            }
            catch (FileNotFoundException fe)
            {
                genericExceptionCatch(fe);
            }
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
    private static HayDayType unmarshal(String dataFileName) throws JAXBException, FileNotFoundException
    {
        JAXBContext jc = JAXBContext.newInstance(HayDayType.class, 
                FarmItem.class, ProductItem.class,
                HarvestItem.class, RareItem.class, MineItem.class);
        Unmarshaller u = jc.createUnmarshaller();
        FileInputStream poFIO = new FileInputStream(dataFileName);
        HayDayType poe = (HayDayType)u.unmarshal(poFIO);
        return poe;
    }
    
    private Object readResolve()
    {
        return hayDay;
    }
    
    private Object writeReplace()
    {
        return hayDay;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    }
}
