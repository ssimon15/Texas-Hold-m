public class AceDiamonds implements Card
{
  private int number;
  private String suit;
  private String name;
    AceDiamonds()
    {
      number=14;
      suit="Diamonds";
      name="Ace of Diamonds";
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