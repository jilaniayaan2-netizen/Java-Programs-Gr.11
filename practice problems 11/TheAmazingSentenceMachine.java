import hsa.Console;

public class TheAmazingSentenceMachine
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();     
    
    int words = 0;
    int sentence = 0;
    String userInput; 
    c.print("Enter a word or sentence: "); 
    userInput = c.readLine(); 
    char compare;
    
    c.println(userInput.toUpperCase());  
    
    c.println(userInput.toLowerCase()); 
    
    c.println(userInput.replaceAll("a", "e"));
    
    for(int i = 0; i <= (userInput.length()-1); ++i)
    { 
      if(userInput.charAt(i) == ' ')
      {
        words++;
      }
      else if(userInput.charAt(i) == '.' || userInput.charAt(i) == '?' || userInput.charAt(i) == '!')
      {
        sentence++;
        words++;
      }
    } 
    c.println("There are " + (words) + " words.");
    c.println("There are " + sentence + " sentences.");
  }    
}