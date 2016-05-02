package user.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserMachine", propOrder = {
        "name",
        "owned",
        "quantity",
        "mastery_level",
        "mastery_hours"
})
public class UserMachine
{
    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "owned", required = true)
    protected boolean owned;
    @XmlElement(name = "quantity", required = true)
    protected int quantity;
    @XmlElement(name = "mastery_level", required = true)
    protected int mastery_level;
    @XmlElement(name = "mastery_hours", required = true)
    protected int mastery_hours;
    
    public String getName()
    {
        return name;
    }
    
    public boolean isOwned()
    {
        return owned;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public int getMasteryLevel()
    {
        return mastery_level;
    }
    
    public int getMasteryHours()
    {
        return mastery_hours;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setOwned(boolean isOwned)
    {
        owned = isOwned;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public void setMasteryLevel(int masteryLevel)
    {
        mastery_level = masteryLevel;
    }
    
    public void setMasteryHours(int masteryHours)
    {
        mastery_hours = masteryHours;
    }
}
