public class Comment
{
    private String poster;
    private String text;
    private String date;
    
    public Comment(String personPosting, String message, String textDate)
    {
        poster = personPosting;
        text = message;
        date = textDate;
    }
    
    public String getPoster() {
        return poster;
    }
    
    public String getText() {
        return text;
    }
    
    public String getDate() {
        return date;
    }
    
    public String toString()
    {
        return text + "\n--" + poster + "(" + date + ")";
    }
}