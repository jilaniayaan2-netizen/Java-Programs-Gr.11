import hsa.Console;

public class FirstLocation2
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console(); 
    
    String userString; 
    String userChar;
    
    c.print("Enter a word: ");
    userString = c.readLine();
    
    c.print("Enter a charecter within that word: "); 
    userChar = c.readString(); 
    
    while(userString.contains(userChar))
    { 
      c.println("The first occurrence for " + userChar + " in " + userString + " is index " + 
              userString.indexOf(userChar)); 
      
      c.print("Enter a charecter within that word: "); 
      userChar = c.readString(); 
    }
    
  }    
}