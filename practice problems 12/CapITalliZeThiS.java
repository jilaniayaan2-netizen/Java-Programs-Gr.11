import hsa.Console;
import java.io.*; 

public class CapITalliZeThiS
{
  static Console c;
 
  public static void main (String[] args) throws IOException 
  {
    c = new Console();   
    
    String output = "";
    String substring = "";
    String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    BufferedReader input = new BufferedReader(new FileReader("..\\textFiles\\capital.txt")); 
    String line = input.readLine(); 
    
    while(line != null)
    { 
      output = ""; 
      
      for(int i = 0; i <= (line.length()-1); ++i)
      { 
        if(uppercase.indexOf(line.charAt(i)) != -1)
        { 
          substring = line.substring(i, i+1);
          output += substring.toLowerCase(); 
        }
        else
        { 
          substring = line.substring(i, i+1);
          output += substring.toUpperCase();
        }
      }
      
      c.println(output);
      line = input.readLine();
    }
    
  }    
}