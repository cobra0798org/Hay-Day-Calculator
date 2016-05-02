package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Silo", propOrder = {
        "silo_size",
        "entry"
})
public class Silo
{
    @XmlElement(name = "silo_size", required = true)
    protected int silo_size;
    @XmlElement(name = "entry", required = true)
    protected ArrayList<Entry> entry;
    
    public int getSiloSize()
    {
        return silo_size;
    }
    
    public ArrayList<Entry> getEntries()
    {
        return entry;
    }
    
    public void setSiloSize(int siloSize)
    {
        silo_size = siloSize;
    }
    
    public void setEntries(ArrayList<Entry> entries)
    {
        this.entry = entries;
    }
}
