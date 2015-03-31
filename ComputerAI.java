import java.util.*;

public class ComputerAI
{
  public boolean checkJoker(ArrayList computerHand)
  {
    boolean checkJoker = true;
    for (int i = computerHand.length()-1; i >= 0; i--)
    {
      if (computerHand[i] == 14)
      {
        checkJoker = true;
      }
      
      else 
      {
        checkJoker = false;
      }
      return checkJoker;
    }
  }
  
  public void pickCard(ArrayList humanHand)
  {
      int compPick = (int)(Math.random() * 10);
      return compPick; 
  }
  
  public void cardTaken(ArrayList computerHand, int humanPick)
  {
    humanPick = i; 
    int humanTake = computerHand.get(i);
    return humanTake;
  }
  
  public void cardGained(int compTake, Arraylist computerHand)
  {
    compTake = i;
    computerHand.add(i);
  }
}   
