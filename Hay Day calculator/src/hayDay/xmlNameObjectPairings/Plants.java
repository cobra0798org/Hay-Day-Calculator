package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;

import hayDay.xmlObjects.Plant;
import hayDay.xmlObjects.HayDayType;

public class Plants
{
    private ArrayList<Plant> plants;
    private static HayDayType hayDay = HayDayAccessor.newHayDayType();
    
    public Plants()
    {
        plants = hayDay.getPlants();
    }
    
    public Plant getPlant(String plantName)
    {
        for (Plant plant : plants)
        {
            if (plantName.equals(plant.getName()))
            {
                return plant;
            }
        }
        return null;
    }
}
