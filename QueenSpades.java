public class QueenSpades implements Card
{
  private int number;
  private String suit;
  private String name;
    QueenSpades()
    {
      number=12;
      suit="Spades";
      name="Queen of Spades";
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