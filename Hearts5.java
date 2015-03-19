public class Hearts5 implements Card
{
  private int number;
  private String suit;
  private String name;
    Hearts5()
    {
      number=5;
      suit="Hearts";
      name="5 of Hearts";
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