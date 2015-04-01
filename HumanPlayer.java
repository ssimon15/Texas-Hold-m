import java.util.Scanner;
public class HumanPlayer
{
 private Card[] hand;
 private int chips;
 private Scanner input = new Scanner(System.in);
 private String iNput;
 
 public HumanPlayer(int a)
 {
   int chips = a;
 }
 
 public void play(int a)
 {
   System.out.println("Bet is $" + a);
   System.out.println("Would you like to raise? Yes or No.");
   iNput = input.next();
   
 }
}