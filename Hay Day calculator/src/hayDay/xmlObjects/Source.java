package hayDay.xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;

import hayDay.Bushes;
import hayDay.xmlNameObjectPairings.Animals;
import hayDay.xmlNameObjectPairings.Machines;
import hayDay.xmlNameObjectPairings.Trees;

@XmlAccessorType(XmlAccessType.FIELD)
public class Source
{
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlValue
    protected String source;
    @XmlTransient
    private Class<?> classType;
    
    public Class<?> getType()
    {
        if(classType == null)
        {
            try
            {
                Class<?> c = Class.forName("hayDay.xmlObjects." + this.type);
                System.out.println(c);
                classType = c;
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        return classType;
    }
    
    public Object getSource(HayDayType hayDay)
    {
        Object source = null;
        System.out.println(this.source);
        if(classType == Machine.class)
        {
            Machines machines = new Machines(hayDay);
            source = machines.getMachine(this.source);
        }
        else if(classType == Animal.class)
        {
            Animals animals = new Animals(hayDay);
            source = animals.getAnimal(this.source);
        }
        else if(classType == Tree.class)
        {
            Trees trees = new Trees(hayDay);
            source = trees.getTree(this.source);
        }
        else if(classType == Bush.class)
        {
            Bushes bushes = new Bushes(hayDay);
            source = bushes.getBush(this.source);
        }
        return source;
    }
}
