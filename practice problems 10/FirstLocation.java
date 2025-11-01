import hsa.Console;

public class FirstLocation
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();  
    
    String userString; 
    String userStringInString; 
    
    c.print("Enter a word or sentence: "); 
    userString = c.readLine(); 
    c.print("Enter a string that exists in the word or sentence that you entered: "); 
    userStringInString = c.readLine();
    
    if(userString.indexOf(userStringInString)>=0)
    {
      c.println("The first occurance for " + userStringInString + " in " + userString + " is letter " + 
                (userString.indexOf(userStringInString)+1)+ ".");
    }
    
    else{
      c.println("No such string exists.");
    }
  }     
}