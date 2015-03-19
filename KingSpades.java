public class KingSpades implements Card
{
  private int number;
  private String suit;
  private String name;
    KingSpades()
    {
      number=13;
      suit="Spades";
      name="King of Spades";
    }
    public int getnumber()
    {
      return number;
    }
    public String getsuit()
    {
      return suit;
    }
    public String getname()
    {
      return name;
    }
}