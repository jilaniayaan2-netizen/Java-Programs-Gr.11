import hsa.Console;

public class Asterisk
{
  static Console c; 
 
  public static void main (String[] args) 
  {
    c = new Console(); 
    
    String input;
    int counter = 0;
    
    c.print("Enter an '*' to continue or anything else to end the program: "); 
    input = c.readLine(); 
        
    while(input.equals("*")) 
    {
      counter++; 
      
      c.print("Enter an '*' to continue or anything else to end the program: "); 
      input = c.readLine(); 
    }
    
    c.print("You entered an '*' " + (counter) + " times."); 
  }    
}