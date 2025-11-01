import hsa.Console;

public class ConcatRepeat
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();   
    
    String word1; 
    String word2; 
    int n;
    
    c.print("Enter a word: "); 
    word1 = c.readLine(); 
    c.print("Enter another word to combine with the first: "); 
    word2 = c.readLine(); 
    n = word1.length();
    
    for(int i = 0; i <= n; ++i)
    { 
      c.println(word1.concat(word2));
    }
  }    
}