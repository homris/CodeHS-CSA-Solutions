public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater object = new Rater("Metehan", 2.5);
        object.updateReview();
        object.setRating(4.7);
        object.updateReview();
    }
}