public class QueenDiamonds implements Card
{
  private int number;
  private String suit;
  private String name;
    QueenDiamonds()
    {
      number=12;
      suit="Diamonds";
      name="Queen of Diamonds";
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