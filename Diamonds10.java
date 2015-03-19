public class Diamonds10 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds10()
    {
      number=10;
      suit="Diamonds";
      name="10 of Diamonds";
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