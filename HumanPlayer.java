public class HumanPlayer
{
 private Card[] hand;
 private int chips;
 
 public HumanPlayer(int a)
 {
   int chips = a;
 }
 
 public void play(int a)
 {
   System.out.print("Bet is $" + a);
 }
}