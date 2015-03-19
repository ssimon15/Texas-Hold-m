public class KingClubs implements Card
{
  private int number;
  private String suit;
  private String name;
    KingClubs()
    {
      number=13;
      suit="Clubs";
      name="King of Clubs";
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