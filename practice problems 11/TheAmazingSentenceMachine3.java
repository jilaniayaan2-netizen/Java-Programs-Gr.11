import hsa.Console;

public class TheAmazingSentenceMachine3
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();              
    
    String userSentence; 
    String userWord; 
    String check = " ";
    int count = 0;
    
    c.print("Enter a sentence: ");
    userSentence = c.readLine(); 
    c.print("Enter a word: ");
    userWord = c.readString(); 
    
    for(int i = 0; i <= (userSentence.length()-1); ++i)
    { 
      check += userSentence.charAt(i); 
      
      if(check.contains(userWord))
      {
        count++;
        check = " ";
      }
    } 
    c.print(userWord + " appears " + count + " times in " + userSentence);
  }    
}