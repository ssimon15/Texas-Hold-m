public class Spades4 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades4()
    {
      number=4;
      suit="Spades";
      name="4 of Spades";
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