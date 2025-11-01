import hsa.Console;

public class StudentsAreComplainingV2
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console(); 
    
    String userInput;
    String output = "";
    int numOfWords = 0;
    
    c.print("Enter a sentence thats 1-6 words long: "); 
    userInput = c.readLine(); 
    
    while(!userInput.equals("*")) 
    {
      for(int i = 0; i <= (userInput.length()-1); ++i)
      { 
        if(userInput.charAt(i) == ' ' || userInput.charAt(i) == '.' || userInput.charAt(i) == '!' || userInput.charAt(i) == '?')
        {
         numOfWords++;
        } 
      }
      
      if(numOfWords > 0 && numOfWords <= 6) 
      {
        output = userInput.replaceAll("[aeiouAEIOU]", ""); 
        c.println(output); 
      
        c.println("Enter another sentence or Enter '*' to end the program: ");
        userInput = c.readLine();
      }
      else
      { 
        c.println("Your sentence is over 6 words.");
        c.println("Re-enter your sentence or enter * to end the program: ");
        userInput = c.readLine();
      }
    }
  }    
}