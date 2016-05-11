package hayDay.xmlObjects;

import exceptions.ProducableException;
import user.xmlObjects.User;

public interface Item extends HayDayXMLObject
{
    double getCostForOne();
    double getCostForTen();
    int getLevel();
    int getTime();
    int getTotalTime(HayDayType hayDay, 
            User user, boolean isProducing, int quantity) throws ProducableException;
}
