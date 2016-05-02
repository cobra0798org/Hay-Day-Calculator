package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserMachines", propOrder = {
        "machine"
})
public class UserMachines
{
    @XmlElement(name = "Machine", required = true)
    protected ArrayList<UserMachine> machine;
    
    public ArrayList<UserMachine> getMachines()
    {
        return machine;
    }
    
    public void setMachines(ArrayList<UserMachine> machines)
    {
        machine = machines;
    }
}
