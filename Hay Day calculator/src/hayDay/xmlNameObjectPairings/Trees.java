package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;

import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Tree;

public class Trees
{
    private ArrayList<Tree> trees;
    private static HayDayType hayDay = HayDayAccessor.newHayDayType();
    
    public Trees()
    {
        trees = hayDay.getTrees();
    }
    
    public Tree getTree(String treeName)
    {
        for (Tree tree : trees)
        {
            if (treeName.equals(tree.getName()))
            {
                return tree;
            }
        }
        return null;
    }
}
