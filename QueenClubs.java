public class QueenClubs implements Card
{
  private int number;
  private String suit;
  private String name;
    QueenClubs()
    {
      number=12;
      suit="Clubs";
      name="Queen of Clubs";
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