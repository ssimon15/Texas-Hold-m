public class JackDiamonds implements Card
{
  private int number;
  private String suit;
  private String name;
    JackDiamonds()
    {
      number=11;
      suit="Diamonds";
      name="Jack of Diamonds";
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