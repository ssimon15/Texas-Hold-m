public class Diamonds5 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds5()
    {
      number=5;
      suit="Diamonds";
      name="5 of Diamonds";
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