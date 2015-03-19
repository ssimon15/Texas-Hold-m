public class AceSpades implements Card
{
  private int number;
  private String suit;
  private String name;
    AceSpades()
    {
      number=14;
      suit="Spades";
      name="Ace of Spades";
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
      