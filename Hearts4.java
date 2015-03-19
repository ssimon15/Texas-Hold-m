public class Hearts4 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts4()
    {
      number=4;
      suit="Hearts";
      name="4 of Hearts";
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