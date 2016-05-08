package hayDay.xmlNameObjectPairings;

import java.util.ArrayList;

import hayDay.xmlObjects.Animal;
import hayDay.xmlObjects.HayDayType;

public class Animals
{
    private ArrayList<Animal> animals;
    public Animals(HayDayType hayDay)
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
