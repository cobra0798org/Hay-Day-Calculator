package user.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAnimal", propOrder = {
        "name",
        "quantity"
})
public class UserAnimal
{
    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "quantity", required = true)
    protected int quantity;
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
