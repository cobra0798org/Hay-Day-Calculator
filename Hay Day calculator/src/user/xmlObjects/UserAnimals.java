package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAniamls", propOrder = {
        "animal"
})
public class UserAnimals
{
    @XmlElement(name = "animal", required = true)
    protected ArrayList<UserAnimal> animal;
    
    public ArrayList<UserAnimal> getAnimals()
    {
        return animal;
    }
    
    public void setAnimals(ArrayList<UserAnimal> animals)
    {
        animal = animals;
    }
}
