public class Diamonds6 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds6()
    {
      number=6;
      suit="Diamonds";
      name="6 of Diamonds";
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