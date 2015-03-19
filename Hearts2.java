public class Hearts2 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts2()
    {
      number=2;
      suit="Hearts";
      name="2 of Hearts";
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