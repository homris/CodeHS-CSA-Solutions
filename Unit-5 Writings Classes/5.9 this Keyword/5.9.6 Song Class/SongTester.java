public class SongTester
{
    public static void main(String[] args)
    {
        // Start here!
        Song randomSong = new Song("Mustafa Kemal Ataturk", "Nutuk", 18, 81);
        System.out.println(randomSong);
        
        randomSong.setMinutes(19);
        randomSong.setSeconds(38);
        System.out.println(randomSong);
        
        randomSong.setArtist("Ataturk");
        System.out.println(randomSong);
    }
}