import java.util.*;
import java.util.Scanner;
public class HumanPlayer
{
 private ArrayList <Card> hand = new ArrayList<Card>();
 private int chips;
 private Scanner input = new Scanner(System.in);
 private int iNput;
 private int cbet;
 private int playernumber;
 
 public HumanPlayer(int a, int b)
 {
   int chips = a;
   int playernumber=b;
 }
 
 public int getchips()
 {
   return chips;
 }
 
 public int play(int a)
 {
   int b = 4;
   System.out.println("Bet is $" + a);
   System.out.println("Enter a number Raise=1, Call=2, Fold=3");
   iNput  = input.nextInt();
   if(iNput==1 || iNput==3 || iNput==2) b = iNput;
   return b;
 }
 public int raise(int a)
 {
   int bet=0;
   boolean complete=false;
   while(complete==false)
   {
   System.out.println("Bet is $" + a);
   System.out.println("How much would you like to raise?");
   iNput = input.nextInt();
   bet = iNput + a;
   if(bet-cbet>chips) System.out.println("You don't have enough chips");
   else complete=true;
   }
   chips=chips-cbet;   
   bet=cbet;
   return bet;
 }
 public int call (int a)
 {
   int bet=0;
   if(a>chips+cbet) bet=chips;
   else bet=a-cbet;
   return bet;
 }
 public void dealt(Card a)
 {
   hand.add(a);
 }
   
 
}