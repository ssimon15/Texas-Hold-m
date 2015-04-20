import java.util.*;
public class Texasholdm
{
  private ArrayList <HumanPlayer> players = new ArrayList<HumanPlayer>();
  private int cbet;
  private int pot;
  public Texasholdm(int a)
  {
  for(int b=0;b<a;b++)
    {
      players.add(new HumanPlayer(1000,a));
      pot=0;
    }
  }
  public void play()
  {
    Deck deck = new Deck();
    deck.shuffle();
    cbet=0;
    for(int a=0;a<2;a++)
    {
      for(HumanPlayer b: players)
      {
        b.dealt(deck.deal());
        deck.dealt();
      }
    }
    for(HumanPlayer a: players)
    {
      if(!a.folded())
      {
      int b = a.play(cbet);
      if(b==1)
      {
        if(cbet<a.getchips()+a.getcbet()-cbet)
        {
        int z=a.getcbet();
        int x=a.raise(cbet);
        cbet=x;
        pot=pot+x-z;
        }
        else
        {
          System.out.println("you don't have enough chips to bet");
          a.play(cbet);
        }
      }
      if(b==2)
      {
        pot=+a.call(cbet);
      }
      if(b==3)
      {
        a.fold();
      }
    }
    }
    
  }
    

}