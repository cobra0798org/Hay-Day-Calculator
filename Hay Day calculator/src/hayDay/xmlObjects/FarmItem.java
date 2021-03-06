package hayDay.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import exceptions.EntryNotFoundException;
import exceptions.ProducableException;
import user.xmlObjects.Silo;
import user.xmlObjects.User;

@XmlRootElement(name = "farm_item")
@XmlAccessorType(XmlAccessType.FIELD)
public class FarmItem implements Item
{
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlElement(name = "cost_for_one", required = true)
    protected double cost_for_one;
    @XmlElement(name = "cost_for_ten", required = true)
    protected double cost_for_ten;
    @XmlElement(name = "exp", required = true)
    protected int exp;
    @XmlElement(name = "time", required = true)
    protected int time;
    @XmlElement(name = "level", required = true)
    protected int level;
    @XmlElement(name = "requirement", required = true)
    protected ArrayList<Requirement> requirement;
    @XmlElement(name = "source", required = true)
    protected Source source;
    
    public String getName()
    {
        return this.name;
    }
    
    public double getCostForOne()
    {
        return this.cost_for_one;
    }
    
    public double getCostForTen()
    {
        return this.cost_for_ten;
    }
    
    public int getExp()
    {
        return this.exp;
    }
    
    /**
     * @return - time required to create the item in minutes
     */
    public int getTime()
    {
        return this.time;
    }
    
    public int getTotalTime(User user, 
            boolean isProducing, int quantity) throws ProducableException
    {
        int time = 0;
        Silo silo = user.getSilo();
        if(!name.equals("none") && !name.equals("nectar"))
        {
            try
            {
                int userQuantity = silo.getEntry(name).getQuantity();
                System.out.println();
                System.out.println("NAME: " + name);
                System.out.println("user quantity: " + userQuantity);
                System.out.println("quantity requested: " + quantity);
                
                if (userQuantity < quantity && userQuantity > 0)
                {
                    int fieldCount = 
                            user.getMachines().getMachines().get(0).getQuantity();
                    quantity = quantity / fieldCount + 1;
                    time = quantity * this.time;
                }
                else if (userQuantity <= 0)
                {
                    throw new ProducableException(true);
                }
            }
            catch (EntryNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("TIME TAKEN: " + time);
        return time;
    }
    
    public int getLevel()
    {
        return this.level;
    }
    
    public ArrayList<Requirement> getRequirements()
    {
        return this.requirement;
    }
    
    public Source getSource()
    {
        return this.source;
    }
}