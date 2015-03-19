public class Hearts6 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts6()
    {
      number=6;
      suit="Hearts";
      name="6 of Hearts";
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