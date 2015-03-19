public class Diamonds2 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds2()
    {
      number=2;
      suit="Diamonds";
      name="2 of Diamonds";
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