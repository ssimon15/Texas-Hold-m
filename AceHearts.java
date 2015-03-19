public class AceHearts implements Card
{
  private int number;
  private String suit;
  private String name;
    AceHearts()
    {
      number=14;
      suit="Hearts";
      name="Ace of Hearts";
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