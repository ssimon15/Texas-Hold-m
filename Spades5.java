public class Spades5 implements Card
{
  private int number;
  private String suit;
  private String name;
    Spades5()
    {
      number=5;
      suit="Spades";
      name="5 of Spades";
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