public class QueenHearts implements Card
{
  private int number;
  private String suit;
  private String name;
    QueenHearts()
    {
      number=12;
      suit="Hearts";
      name="Queen of Hearts";
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