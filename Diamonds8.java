public class Diamonds8 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds8()
    {
      number=8;
      suit="Diamonds";
      name="8 of Diamonds";
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