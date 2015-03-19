public class Hearts8 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts8()
    {
      number=8;
      suit="Hearts";
      name="8 of Hearts";
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