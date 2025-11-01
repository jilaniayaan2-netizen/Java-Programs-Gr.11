import hsa.Console;

public class SayMyName 
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();  
    
    String userName; 
    String continueOrNot = "yes"; 
    
    c.print("Enter your name: "); 
    userName = c.readLine(); 
    
    while(continueOrNot.equals("yes"))
    {
      printName(userName); 
      c.print("Would you like to print your name again? Enter 'yes' or 'no': "); 
      continueOrNot = c.readLine();
    }
  }
  public static void printName(String name)
  { 
    c.println(name);
  }
}