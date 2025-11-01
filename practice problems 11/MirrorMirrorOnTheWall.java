import hsa.Console;

public class MirrorMirrorOnTheWall
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();           
    
    String userSentence; 
    String outputSentence = ""; 
    
    c.print("Enter a sentence: ");
    userSentence = c.readLine(); 
    
    for(int i = userSentence.length()-1; i >= 0; --i)
    { 
      outputSentence += userSentence.charAt(i);
    }
    c.print(outputSentence);
  }    
}