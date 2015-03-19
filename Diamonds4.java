public class Diamonds4 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds4()
    {
      number=4;
      suit="Diamonds";
      name="4 of Diamonds";
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