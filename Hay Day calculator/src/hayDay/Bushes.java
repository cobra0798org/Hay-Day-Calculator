package hayDay;

import java.util.ArrayList;

import hayDay.xmlObjects.Bush;
import hayDay.xmlObjects.HayDayType;

public class Bushes
{
    private ArrayList<Bush> bushes;
    
    public Bushes(HayDayType hayDay)
    {
        bushes = hayDay.getBushes();
    }
    
    public Bush getBush(String bushName)
    {
        for (Bush bush : bushes)
        {
            if (bushName.equals(bush.getName()))
            {
                return bush;
            }
        }
        return null;
    }
}