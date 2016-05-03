package main;

import java.util.ArrayList;
import java.util.HashMap;

import debug.PrintTests;
import hayDay.xmlNameObjectPairings.HayDayAccessor;
import hayDay.xmlObjects.HayDayType;
import hayDay.xmlObjects.Item;
import user.xmlAccessors.UserAccessor;
import user.xmlObjects.Entry;
import user.xmlObjects.User;

public class HayDayCalculator
{
    public static void main(String[] args)
    {
        HayDayType hayDay = HayDayAccessor.unmarshal();
        PrintTests.printProductItemTests(hayDay.getProductItems());
    }
    
    @SuppressWarnings("unused")
    public static void amain(String[] args)
    {
        HayDayType hayDay = HayDayAccessor.unmarshal();
        User user = UserAccessor.unmarshal("GreenEggsAndHam");
        
        ArrayList<Entry> barnEntries = user.getBarn().getEntries();
        HashMap<Item, Integer> barnItems = new HashMap<Item, Integer>();
        for (Entry entry : barnEntries)
        {
            barnItems.put(entry.getType(hayDay), entry.getQuantity());
        }
        Calculator calculator = new Calculator();
        double barnSum = calculator.calculateSum(barnItems);
        System.out.println("************BARN SUM************");
        System.out.println(barnSum);
        System.out.println();
        
        ArrayList<Entry> siloEntries = user.getSilo().getEntries();
        HashMap<Item, Integer> siloItems = new HashMap<Item, Integer>();
        for (Entry entry : siloEntries)
        {
            siloItems.put(entry.getType(hayDay), entry.getQuantity());
        }
        double siloSum = calculator.calculateSum(siloItems);
        System.out.println("************SILO SUM************");
        System.out.println(siloSum);
        System.out.println();
    }
}
