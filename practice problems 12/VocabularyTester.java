import hsa.Console;
import java.io.*;

public class VocabularyTester 
{
  static Console c;
 
  public static void main (String[] args) throws IOException
  {
    c = new Console();  
    
    BufferedReader ballalInput = new BufferedReader(new FileReader("..\\textFiles\\inputBallal.txt")); 
    PrintWriter ballalOutput = new PrintWriter(new FileWriter("..\\textFiles\\outputBallal.txt")); 
    
    BufferedReader burnsInput = new BufferedReader(new FileReader("..\\textFiles\\inputBurns.txt")); 
    PrintWriter burnsOutput = new PrintWriter(new FileWriter("..\\textFiles\\outputBurns.txt"));  
    
    String lineBurns = "";
    String lineBallal = "";
    
    double numBallal = 0;
    double numBurns = 0; 
    
    double wordsBallal = 0;
    double wordsBurns = 0; 
    
    double charectersBallal = 0; 
    double charectersBurns = 0;
    
    lineBurns = burnsInput.readLine(); 
    while(lineBurns != null)
    { 
      for(int i = 0; i <= (lineBurns.length()-1); ++i) 
      {
        if(lineBurns.charAt(i) != ' ' || lineBurns.charAt(i) != '.' || lineBurns.charAt(i) == '?' || lineBurns.charAt(i) == '!') 
        { 
          charectersBurns++;
        }
        if(lineBurns.charAt(i) == ' ')
        {
         wordsBurns++;
        }
        else if(lineBurns.charAt(i) == '.' || lineBurns.charAt(i) == '?' || lineBurns.charAt(i) == '!')
        {
         wordsBurns++;
        }
      } 
      numBurns = (charectersBurns/wordsBurns); 
      burnsOutput.println("Mr.Burns average is " + numBurns + ".");
      lineBurns = burnsInput.readLine();
    }
    burnsOutput.close();
    c.println("Mr.Burns average has been outputted!");
    
    lineBallal = ballalInput.readLine(); 
    while(lineBallal != null)
    { 
      for(int i = 0; i <= (lineBallal.length()-1); ++i) 
      {
        if(lineBallal.charAt(i) != ' ' || lineBallal.charAt(i) != '.' || lineBallal.charAt(i) == '?' || lineBallal.charAt(i) == '!') 
        { 
          charectersBallal++;
        }
        if(lineBallal.charAt(i) == ' ')
        {
         wordsBallal++;
        }
        else if(lineBallal.charAt(i) == '.' || lineBallal.charAt(i) == '?' || lineBallal.charAt(i) == '!')
        {
         wordsBallal++;
        }
      } 
      lineBallal = ballalInput.readLine();
      numBallal = (charectersBallal/wordsBallal); 
     ballalOutput.println("Ballal's average is " + numBallal + ".");
    }
    ballalOutput.close();
    c.println("Ballal's average has been outputted!");
  }    
}