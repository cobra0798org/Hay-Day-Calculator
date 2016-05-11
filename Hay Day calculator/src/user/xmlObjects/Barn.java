package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import exceptions.EntryNotFoundException;

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
    
    public Entry getEntry(String entryName) throws EntryNotFoundException
    {
        Entry requestedEntry = null;
        boolean found = false;
        for (int i = 0; i < entry.size() && !found; i++)
        {
            Entry e = entry.get(i);
            if (e.getName().equals(entryName))
            {
                requestedEntry = e;
                found = true;
            }
        }
        
        if (requestedEntry == null)
        {
            throw new EntryNotFoundException(entryName, "barn");
        }
        return requestedEntry;
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
