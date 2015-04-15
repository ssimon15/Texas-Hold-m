public class Card
{
  //instance variables
  
  int myNumber;
  String mySuit;
  
  public Card(int number, String suit)
  { // deck.add(new Card(5,"Clubs"))
    myNumber = number;
    mySuit = suit;
  }
  
  
  //Methods
  public int getnumber()
  {
    return myNumber;
  }
  public String getsuit()
  {
    return mySuit;
  }
  public String getname()
  {
    String name="";
    if(myNumber==1) name="Ace of "+mySuit;
    else if(myNumber==11) name="Jack of "+mySuit;
    else if(myNumber==12) name="Queen of "+mySuit;
    else if(myNumber==13) name="King of "+mySuit;
    else name=myNumber+" of "+mySuit;
    return name;
  }
}