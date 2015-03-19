public class JackSpades implements Card
{
  private int number;
  private String suit;
  private String name;
    JackSpades()
    {
      number=11;
      suit="Spades";
      name="Jack of Spades";
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