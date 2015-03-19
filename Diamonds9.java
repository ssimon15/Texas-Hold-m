public class Diamonds9 implements Card
{
  private int number;
  private String suit;
  private String name;
    Diamonds9()
    {
      number=9;
      suit="Diamonds";
      name="9 of Diamonds";
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