public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        int wordLength = (word.length())/2;
        String newWord = word.substring(wordLength, word.length()) + word.substring(0, wordLength);
        return newWord;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
       String indexString = word.substring(0, insertIdx) + insertText + word.substring(insertIdx, word.length());
       return indexString;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int index = word.indexOf(insertChar);
        String newString = word.substring(0, index) + insertText + word.substring(index, word.length());
        return newString;
    }
    
    
    public String toString()
    {
        // Games[word]
        String returnString = "[" + word + "]";
        return returnString;
    }
    
    
}