package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;

import hayDay.xmlObjects.Animal;
import hayDay.xmlObjects.HayDayType;

public class Animals
{
    private ArrayList<Animal> animals;
    private static HayDayType hayDay = HayDayAccessor.newHayDayType();
    
    public Animals()
    {
        animals = hayDay.getAnimals();
    }

    public Animal getAnimal(String animalName)
    {
        for (Animal animal : animals)
        {
            if (animalName.equals(animal.getName()))
            {
                return animal;
            }
        }
        return null;
    }
}
