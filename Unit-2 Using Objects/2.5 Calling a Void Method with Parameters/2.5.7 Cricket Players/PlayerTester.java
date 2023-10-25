public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       CricketPlayer player1 = new CricketPlayer("metehan", "bulls");
       CricketPlayer player2 = new CricketPlayer("homris");
       
       player1.addMatch(3, 3);
       player1.addMatch(3, 3);
       player1.addMatch(3, 3);
       player1.addMatch(3, 3);
       System.out.println("Homris Stats");
       player1.printRunsScored();
       player1.printBallsBowled();
       System.out.println(player1);
       
       player2.addMatch(3, 3);
       player2.addMatch(3, 3);
       player2.addMatch(3, 3);
       player2.addMatch(3, 3);
       System.out.println("Metehan Stats");
       player2.printRunsScored();
       player2.printBallsBowled();
       System.out.println(player2);
    }
}