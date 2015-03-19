public class Hearts9 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts9()
    {
      number=9;
      suit="Hearts";
      name="9 of Hearts";
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