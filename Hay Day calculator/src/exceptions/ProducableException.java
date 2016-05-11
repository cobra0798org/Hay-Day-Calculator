package exceptions;

public class ProducableException extends Exception
{
    private String message;
    public ProducableException()
    {
       message = "This item is not producable. it is either because it's requirements"
               + "\nare currently unavailable, or because the item cannot be"
               + "\npredictably produced.";
    }
    
    public ProducableException(boolean isNormallyProducable)
    {
        message = (isNormallyProducable) ?
                "This item is not producable. Its requirements are currently"
                + "\nunavailable." :
                "This item is not producable. It cannot be predictably produced.";
    }
    
    @Override
    public String getMessage()
    {
        return message;
    }
}
