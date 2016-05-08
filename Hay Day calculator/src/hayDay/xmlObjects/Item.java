package hayDay.xmlObjects;

public interface Item extends HayDayXMLObject
{
    double getCostForOne();
    double getCostForTen();
    int getLevel();
    int getTime();
}
