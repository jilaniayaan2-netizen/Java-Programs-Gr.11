import hsa.Console;

public class StudentsAreComplaining
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();    
    
    String userInput;
    String output = "";
    
    c.print("Enter a word: "); 
    userInput = c.readString(); 
    
    while(!userInput.equals("*"))
    { 
      output = userInput.replaceAll("[aeiouAEIOU]", ""); 
      c.println(output); 
      
      c.print("Enter another word or Enter '*' to end the program: ");
      userInput = c.readString();
    }
  }    
}