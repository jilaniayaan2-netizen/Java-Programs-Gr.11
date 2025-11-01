public class Die
{
  private int numOfSides; 
  
  public Die(int sides)
  {
    numOfSides = sides; 
  }
  
  public void rollDie(int numRolled)
  {
    numRolled = (int)(Math.random()* numOfSides + 1); 
  } 
  
  public int getSides()
  {
    return numOfSides; 
  }
}