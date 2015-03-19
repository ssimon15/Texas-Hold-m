public class Diamonds3 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds3()
    {
      number=3;
      suit="Diamonds";
      name="3 of Diamonds";
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