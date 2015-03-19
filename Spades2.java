public class Spades2 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades2()
    {
      number=2;
      suit="Spades";
      name="2 of Spades";
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