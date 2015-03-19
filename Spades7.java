public class Spades7 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades7()
    {
      number=7;
      suit="Spades";
      name="7 of Spades";
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