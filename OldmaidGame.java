import java.util.*;

public class OldmaidGame
{
  int players = 0;
  ArrayList <int> myDeck = new ArrayList<Card>();
  public static void main(String args[])
  {
    for (int i = 1; i<= 13; i++)
    {
      myDeck.add(i);
      myDeck.add(i);
      myDeck.add(i);
      myDeck.add(i); 
    }
    
    myDeck.add(14);
    
    OldmaidGame.shuffle();
    OldmaidGame.deal();
    while (gameOver == false)
    {
      Humanplayer.checkJoker();
      ComputerAI.checkJoker();
      Humanplayer.pickCard();
      ComputerAI.cardTaken();
      Humanplayer.cardGained();
      ComputerAI.pickCard();
      Humanplayer.cardTaken();
      ComputerAI.pickCard();
      OldmaidGame.gameOver();
    }
  }
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
  
  public ArrayList deal(int players)
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
  
  public String gameOver(ArrayList humanHand, ArrayList computerHand)
  {
    gameOver = true; 
    
    if (humanHand == 0)
    {
      System.out.println("You win!"); 
      return gameOver;
    }
    if (computerHand == 0)
    {
      System.out.println("You lose...");
      return gameOver;
    }
    else
    {
      System.out.println("Continue");
      gameOver = false;
      return gameOver;
    }
  }
}