import java.util.*;

public class HumanPlayer
{
  Scanner input = new Scanner(System.in);
  public boolean checkJoker (ArrayList humanHand)
  {
  boolean checkJoker = true;
  for (int i = humanHand.length()-1; i >= 0; i--)
  {
    if (humanHand[i] = 14)
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
        
  public int pickCard(ArrayList computerHand)
  {
   for (i = 0; i <= computerHand.length()-1;)
   {
     i++;
   }
   System.out.println("Pick a card between 0 and " + i);
   int humanPick = input.nextInt();
     return humanPick; 
  }
  
  public int cardTaken(ArratList humanHand, int compPick)
  {
    compPick = i; 
    int compTake = humanHand.get(i);
    return compTake;
  }
  
  public int cardGained(int humanTake, ArrayList humanHand)
  {
    humanTake = i;
    humanHand.add(i);
  }
}  