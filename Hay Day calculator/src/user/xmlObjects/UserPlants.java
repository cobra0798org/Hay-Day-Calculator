package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPlants", propOrder = {
        "plant"
})
public class UserPlants
{
    @XmlElement(name = "plant", required = true)
    protected ArrayList<UserPlant> plant;
    
    public ArrayList<UserPlant> getPlant()
    {
        return plant;
    }
    
    public void setPlants(ArrayList<UserPlant> plants)
    {
        plant = plants;
    }
}
