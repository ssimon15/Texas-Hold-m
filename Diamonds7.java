public class Diamonds7 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds7()
    {
      number=7;
      suit="Diamonds";
      name="7 of Diamonds";
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