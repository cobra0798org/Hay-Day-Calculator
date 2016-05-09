package user.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserBush", propOrder = {
        "name",
        "quantity",
        "life_cycle_level"
})
//TODO: potential duplicate of UserTree; consider merging
public class UserBush
{
    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "quantity", required = true)
    protected int quantity;
    @XmlElement(name = "life_cycle_level", required = true)
    protected int life_cycle_level;
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    //TODO: change return to enum
    public int getLifeCycleLevel()
    {
        return life_cycle_level;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    //TODO: change param to enum
    public void setLifeCycleLevel(int lifeCycleLevel)
    {
        life_cycle_level = lifeCycleLevel;
    }
}
