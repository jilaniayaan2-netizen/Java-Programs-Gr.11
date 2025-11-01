import hsa.Console;

public class Unicode
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();      
    
    String string1; 
    c.print("Enter a string: ");
    string1 = c.readLine(); 
    
    String string2; 
    c.print("Enter another string: ");
    string2 = c.readLine(); 
    
    if(string1.equals(string2))
    {
      c.print("The first string is identical to the second string"); 
    }
    else if(string1.compareTo(string2) > 0)
    { 
      c.print("The first different character from the first string has a higher UNICODE value"); 
    }
    else 
    { 
      c.print("The first different character from the first string has a lower UNICODE value");
    }
  }    
}