public class Spades3 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades3()
    {
      number=3;
      suit="Spades";
      name="3 of Spades";
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