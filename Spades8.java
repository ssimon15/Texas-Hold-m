public class Spades8 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades8()
    {
      number=8;
      suit="Spades";
      name="8 of Spades";
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