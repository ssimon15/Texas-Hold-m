public class AceClubs implements Card
{
  private int number;
  private String suit;
  private String name;
    AceClubs()
    {
      number=14;
      suit="Clubs";
      name="Ace of Clubs";
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