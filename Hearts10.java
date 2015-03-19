public class Hearts10 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts10()
    {
      number=10;
      suit="Hearts";
      name="10 of Hearts";
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