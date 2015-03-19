public class KingDiamonds implements Card
{
  private int number;
  private String suit;
  private String name;
    KingDiamonds()
    {
      number=13;
      suit="Diamonds";
      name="King of Diamonds";
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