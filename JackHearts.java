public class JackHearts implements Card
{
  private int number;
  private String suit;
  private String name;
    JackHearts()
    {
      number=11;
      suit="Hearts";
      name="Jack of Hearts";
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