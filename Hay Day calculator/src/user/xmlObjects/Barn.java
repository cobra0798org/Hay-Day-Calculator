package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Barn", propOrder = {
        "barn_size",
        "entry"
})
public class Barn
{
    @XmlElement(name = "barn_size", required = true)
    protected int barn_size;
    @XmlElement(name = "entry", required = true)
    protected ArrayList<Entry> entry;
    
    public int getBarnSize()
    {
        return barn_size;
    }
    
    public ArrayList<Entry> getEntries()
    {
        return entry;
    }
    
    public void setBarnSize(int barnSize)
    {
        barn_size = barnSize;
    }
    
    public void setEntries(ArrayList<Entry> entries)
    {
        this.entry = entries;
    }
}
