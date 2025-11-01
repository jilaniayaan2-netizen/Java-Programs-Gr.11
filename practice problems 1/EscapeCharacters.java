import hsa.Console;

public class EscapeCharacters
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    //Part A
    c.println("A slash is \"/\""); 
    c.println("while");
    c.println("A backslash is \"\\\"");
    c.println();
    
    //Part B
    c.println("A slash is \"/\""); c.println("while"); c.print("A backslash is \"\\\"");
  }
}
