import hsa.Console;

public class LastLocation
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();    
    
    String userString; 
    String userStringInString; 
    int location; 
    
    c.print("Enter a word or sentence: "); 
    userString = c.readLine(); 
    c.print("Enter a string that exists in the word or sentence that you entered: "); 
    userStringInString = c.readLine();
    c.print("Enter postion to end search: "); 
    location = c.readInt();
    
    if(userString.lastIndexOf(userStringInString, location)>=0)
    {
      c.println("The first occurance for " + userStringInString + " in " + userString + " is letter " + 
                (userString.lastIndexOf(userStringInString, location)+1)+ ".");
    }
    else 
    {
      c.println("No such string exists.");
    }
    
  }    
}