public class JackClubs implements Card
{
  private int number;
  private String suit;
  private String name;
    JackClubs()
    {
      number=11;
      suit="Clubs";
      name="Jack of Clubs";
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