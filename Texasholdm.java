import java.util.*;
public class Texasholdm
{
  ArrayList <HumanPlayer> players = new ArrayList<HumanPlayer>();
  int cbet;
  public Texasholdm(int a)
  {
  for(int b=0;b<a;b++)
    {
      players.add(new HumanPlayer(1000,a));
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
      int b = a.play(cbet);
      if(b==1)
      {
        cbet=a.raise(cbet);
      }
    }
    
  }
    

}