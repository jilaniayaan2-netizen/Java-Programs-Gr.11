import hsa.Console;
import java.io.*;

public class ZynahQuestion
{
  static Console c;
 
  public static void main (String[] args) throws IOException
  {
    c = new Console(); 
     
    int lineCount = 0; 
    BufferedReader input = new BufferedReader(new FileReader("..\\textFiles\\nurseryRhyme.txt")); 
    PrintWriter output = new PrintWriter(new FileWriter("..\\textFiles\\nurseryRhyme.txt"));
    String line = input.readLine();
    
    while(line != null)
    { 
      lineCount++;
      output.println(lineCount + " " + line);
      line = input.readLine();
    }
    
    c.print("The poem has been saved to the same file.");
    output.close(); 
  }    
}