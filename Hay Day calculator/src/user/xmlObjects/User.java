package user.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class User
{
    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "level", required = true)
    protected int level;
    @XmlElement(name = "exp_on_current_level", required = true)
    protected int exp_on_current_level;
    @XmlElement(name = "barn", required = true)
    protected Barn barn;
    @XmlElement(name = "silo", required = true)
    protected Silo silo;
    @XmlElement(name = "machines", required = true)
    protected UserMachines machines;
    @XmlElement(name = "trees", required = true)
    protected UserTrees trees;
    @XmlElement(name = "bushes", required = true)
    protected UserBushes bushes;
    @XmlElement(name = "animals", required = true)
    protected UserAnimals animals;
    
    public User()
    {
        
    }
    
    /**
     * creates a user with a farm name of <code>name</code>.
     * @param name - farm name
     */
    public User(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    /**
     * 
     * @return the amount of exp that the user has towards the next level.
     */
    public int getExpOnCurrentLevel()
    {
        return exp_on_current_level;
    }
    
    public Barn getBarn()
    {
        return barn;
    }
    
    public Silo getSilo()
    {
        return silo;
    }
    
    public UserMachines getMachines()
    {
        return machines;
    }
    
    public UserTrees getTrees()
    {
        return trees;
    }
    
    public UserBushes getBushes()
    {
        return bushes;
    }
    
    public UserAnimals getAnimals()
    {
        return animals;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setLevel(int level)
    {
        this.level = level;
    }
    
    /**
     * 
     * @param expOnCurrentLevel -
     *  the amount of exp that the user has towards the next level.
     */
    public void setExpOnCurrentLevel(int expOnCurrentLevel)
    {
        exp_on_current_level = expOnCurrentLevel;
    }
    
    public void setBarn(Barn barn)
    {
        this.barn = barn;
    }
    
    public void setSilo(Silo silo)
    {
        this.silo = silo;
    }
    
    public void setMachines(UserMachines machines)
    {
        this.machines = machines;
    }
    
    public void setTrees(UserTrees trees)
    {
        this.trees = trees;
    }
    
    public void setBushes(UserBushes bushes)
    {
        this.bushes = bushes;
    }
    
    public void setAnimals(UserAnimals animals)
    {
        this.animals = animals;
    }
}
