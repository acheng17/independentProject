public class OldmaidGame
{
  public static void main(String args[])
  {
  public int players = 0;
  private ArrayList <Card> myDeck = new ArrayList<Card>();
  for (int i = 1; i<= 13; i++)
  {
    myDeck.add(i);
    myDeck.add(i);
    myDeck.add(i);
    myDeck.add(i); 
  }
  
  myDeck.add(14);
  
  public ArrayList shuffle(ArrayList myDeck)
  {
    for (int i = 0; i < myDeck.length()-1; i++)
    {
     int random = (int)(Math.random() * (i+1));
     Integer temp = myDeck.get(i);
     myDeck.get(i) = myDeck.get(random);
     myDeck.get(random) = temp;
    }
    return myDeck;
  }
  
  public void deal(int players)
  {
    public ArrayList <Card> computerHand = new ArrayList<Card>();
    public ArrayList <Card> humanHand = new ArrayList<Card>();
    public boolean isEven = false;
    for (int i = myDeck.length()-1; i >= 0; i--)
    {
      if (isEven)
      {
        int odds = i;
        humanHand.add(odds);
      }
      if (!isEven)
      {
        int evens = i;
        compuerHand.add(evens);
      }
    }
    return humanHand;
    return computerHand;
  }
   
  public void gameOver(humanHand, computerHand)
    if (humanHand == 0)
  {
    return "You win!"; 
  }
  if (computerHand == 0)
  {
    return "You lose...";
  }
  else 
    return "Continue";
  }
}