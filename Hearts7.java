public class Hearts7 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts7()
    {
      number=7;
      suit="Hearts";
      name="7 of Hearts";
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