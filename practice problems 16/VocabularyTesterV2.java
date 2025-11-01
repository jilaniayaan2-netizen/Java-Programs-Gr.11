import hsa.Console;
import java.io.*;

public class VocabularyTesterV2
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
    int counterBurns = 0; 
    int counterBallal = 0;
    
    lineBurns = burnsInput.readLine();
     while(lineBurns != null)
    { 
      for(int i = 0; i <= (lineBurns.length()-1); ++i) 
      {
        while(lineBurns.charAt(i) != ' ')
        {
         counterBurns++;
        }
        if(counterBurns > 3)
        {
         wordsBurns++;
         charectersBurns = counterBurns; 
         counterBurns = 0;
        }
        lineBurns = burnsInput.readLine();
       } 
     }
  numBurns = (charectersBurns/wordsBurns); 
  burnsOutput.println("Mr.Burns average is " + numBurns + ".");
     
  lineBallal = ballalInput.readLine();
  while(lineBallal != null)
  { 
    for(int i = 0; i <= (lineBallal.length()-1); ++i) 
    {
      while(lineBallal.charAt(i) != ' ')
      {
        counterBallal++;
      }
      if(counterBurns > 3)
      {
        wordsBallal++;
        charectersBallal = counterBallal; 
        counterBallal = 0;
      }
      lineBallal = ballalInput.readLine();
    }  
  }
 numBallal = (charectersBallal/wordsBallal); 
 ballalOutput.println("Ballal's average is " + numBallal + ".");
 }
}