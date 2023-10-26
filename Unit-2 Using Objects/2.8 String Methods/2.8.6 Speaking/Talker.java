public class Talker
{
    private String speech;
    
    // Constructor
    public Talker(String startingText)
    {
        speech = startingText;
    }
    
    // Returns the text in all uppercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String outdoorVoice()
    {
        String upper = speech.toUpperCase();
        return upper;
    }
    
    // Returns the text in all lowercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String indoorVoice()
    {
        String lower = speech.toLowerCase();
        return lower;
    }
    
    // Reset the instance variable to the new text
    public void setSpeech(String text)
    {
        speech = text;
    }
    
    // Returns a String representatin of this object
    // The returned String should look like
    // 
    // "Text goes here," said the talker
    // 
    // The quotes should appear in the String
    // The text displayed should be the value of the instance variable
    public String toString()
    {
        String print = "\"" + speech + ",\" said the talker";
        return print;
    }
}