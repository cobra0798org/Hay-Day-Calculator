package user.xmlObjects;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserTrees", propOrder = {
        "tree"
})
public class UserTrees
{
    @XmlElement(name = "tree", required = true)
    protected ArrayList<UserTree> tree;
    
    public ArrayList<UserTree> getTrees()
    {
        return tree;
    }
    
    public void setTrees(ArrayList<UserTree> trees)
    {
        tree = trees;
    }
}
