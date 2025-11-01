import hsa.Console;

public class TheAmazingSentenceMachine4
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();              
    
    String userString; 
    int userInt; 
    
    c.print("Enter a sentence: ");
    userString = c.readLine(); 
    c.print("Enter a number: "); 
    userInt = c.readInt(); 
    
    for(int i = userInt; i <= (userString.length()-1); i+=userInt) 
    { 
      c.println(userString.charAt(i));
    } 
  }    
}