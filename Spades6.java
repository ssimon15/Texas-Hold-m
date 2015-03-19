public class Spades6 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades6()
    {
      number=6;
      suit="Spades";
      name="6 of Spades";
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