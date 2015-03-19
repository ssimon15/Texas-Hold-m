public class Hearts3 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts3()
    {
      number=3;
      suit="Hearts";
      name="3 of Hearts";
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