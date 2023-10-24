public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       Coins initial = new Coins(3, 2, 1, 4);
       initial.bankValue();
       initial.addQuarter();
       initial.addQuarter();
       initial.addDime();
       initial.addPenny();
       initial.addPenny();
       initial.addPenny();
       initial.bankCount();
       initial.bankValue();
    }
}