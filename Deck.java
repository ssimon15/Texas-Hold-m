import java.util.*;
public class Deck
{
  private ArrayList <Card> deck = new ArrayList<Card>();
  
  public Deck()
  {
    for(int i=1; i<14; i++)
    {
      deck.add(new Card(i,"Clubs"));
      deck.add(new Card(i,"Spades"));
      deck.add(new Card(i,"Diamonds"));
      deck.add(new Card(i,"Hearts"));
    }
    
  }
  public void shuffle()
  {
    ArrayList <Card> shuf = new ArrayList<Card>();
    while(deck.size()<0)
    {
      shuf.add(deck.get((int)(Math.random() *deck.size())));
    }
    deck=shuf;
  }
  public Card deal()
  {
    Card a = deck.get(0);
    deck.remove(0);
    return a;
  }
  public void dealt()
  {
    deck.remove(0);
  }
}