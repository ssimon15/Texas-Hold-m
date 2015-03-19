public class Spades10 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades10()
    {
      number=10;
      suit="Spades";
      name="10 of Spades";
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