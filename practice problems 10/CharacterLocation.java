import hsa.Console;

public class CharacterLocation
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();  
    
    String userString; 
    int userInt;
    int rangeOfString; 
    
    c.print("Enter a sentence: "); 
    userString = c.readLine(); 
    c.print("Enter an int for the location of a letter: "); 
    userInt = c.readInt(); 
    
    rangeOfString = userString.length(); 
    
    if(userInt <= rangeOfString)
    { 
      c.print(userString.charAt(userInt-1));
    }
    else 
    { 
      c.print("Your number is invalid");
    }
  }     
}