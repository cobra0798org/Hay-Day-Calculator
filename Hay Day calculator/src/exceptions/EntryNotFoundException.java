package exceptions;

public class EntryNotFoundException extends Exception
{
    private String message;
    
    public EntryNotFoundException()
    {
        message = "The requested entry was not found.";
    }
    
    public EntryNotFoundException(String entryName)
    {
        message = "The requested entry " + entryName + " was not found.";
    }
    
    public EntryNotFoundException(String entryName, String location)
    {
        message = "The requested entry " + entryName 
                + " was not found in " + location + ".";
    }
    
    @Override
    public String getMessage()
    {
        return message;
    }
}
