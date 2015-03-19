public class KingHearts implements Card
{
  private int number;
  private String suit;
  private String name;
    KingHearts()
    {
      number=13;
      suit="Hearts";
      name="King of Hearts";
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