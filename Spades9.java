public class Spades9 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades9()
    {
      number=9;
      suit="Spades";
      name="9 of Spades";
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