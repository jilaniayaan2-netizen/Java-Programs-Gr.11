import hsa.Console;
import java.io.*; 

public class ReadToMe
{
  static Console c;
 
  public static void main (String[] args) throws IOException 
  {
    c = new Console();              
    
    String line;
    BufferedReader input = new BufferedReader(new FileReader("..\\textFiles\\nurseryRhyme.txt")); 
    line = input.readLine();
    
    while(line != null)
    { 
      c.println(line);
      line = input.readLine();
    }
    
  }    
}