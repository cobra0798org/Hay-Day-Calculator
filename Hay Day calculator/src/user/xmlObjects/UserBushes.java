package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserBushes", propOrder = {
        "bush"
})
public class UserBushes
{
    @XmlElement(name = "bush", required = true)
    protected ArrayList<UserBush> bush;
    
    public ArrayList<UserBush> getBushes()
    {
        return bush;
    }
    
    public void setBushes(ArrayList<UserBush> bushes)
    {
        bush = bushes;
    }
}
