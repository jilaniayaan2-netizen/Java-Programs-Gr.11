import hsa.Console;
import java.awt.*;

public class TheIrritableMagic8
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();   
    
    String ballMood = mood(); 
    String ballResponse = response(); 
    String ballOutput;
    
    input();
    output(ballMood, ballResponse);
    drawFace(ballMood);
  }
  public static String input()
  { 
    String question;
    c.print("How do you feel today? Enter Happy, Angry, or Sad: ");
    question = c.readString();
    return question;
  }
  public static String mood()
  {
    double randomNum = Math.random()*1.0; 
    String mood = ""; 
    if(0.0 < randomNum && randomNum <= 0.33)
    { 
      mood = "Happy";
    }
    else if(0.34 < randomNum && randomNum <= 0.66)
    {
      mood = "Angry";
    }
    else if(0.67 < randomNum && randomNum <= 1.0)
    {
      mood = "Sad";
    }
    return mood;
  }
  public static String response()
  { 
    double randomNum = Math.random()*1.0; 
    String generatedAnswer = "";
    if(0.0 < randomNum && randomNum <= 0.33)
    { 
      generatedAnswer = "yes";
    }
    else if(0.34 < randomNum && randomNum <= 0.66)
    {
      generatedAnswer = "no";
    }
    else if(0.67 < randomNum && randomNum <= 1.0)
    {
      generatedAnswer = "maybe";
    }
    return generatedAnswer;
  }
  public static void output(String mood, String answer)
  {
    if(mood.equals("Happy"))
    {
      if(answer.equals("yes"))
      { 
        c.print("Have a nice day!");
      }
      if(answer.equals("no"))
      { 
        c.print("I dont care, you bother me too much");
      }
      if(answer.equals("maybe"))
      { 
        c.print("Nice");
      }
    }
    else if(mood.equals("Angry"))
    { 
      if(answer.equals("yes"))
      { 
        c.print("Why are you angry?");
      }
      if(answer.equals("no"))
      { 
        c.print("Definitely not – You bother me too much!");
      }
      if(answer.equals("maybe"))
      { 
        c.print("I don't really care man");
      }
    }
    else if(mood.equals("Sad"))
    { 
      if(answer.equals("yes"))
      { 
        c.print("I hope you feel better");
      }
      if(answer.equals("no"))
      { 
        c.print("Stay sad lol");
      }
      if(answer.equals("maybe"))
      { 
        c.print("hope you feel better, i guess?");
      }
    }
  }
  public static void drawFace (String mood)
  {
    if(mood.equals("Happy"))
    {
      c.setColor(Color.yellow);
      c.fillOval(100, 100, 100, 100);
      c.setColor(Color.black);
      c.drawOval(100, 100, 100, 100);
      c.fillOval(115, 125, 25, 25);
      c.fillOval(160, 125, 25, 25);
      c.drawLine(115, 160, 135, 180);
      c.drawLine(135, 180, 165, 180);
      c.drawLine(165, 180, 185, 160);
    }
    else if(mood.equals("Angry"))
    { 
      c.setColor(Color.red);
      c.fillOval(100, 100, 100, 100);
      c.setColor(Color.black);
      c.drawOval(100, 100, 100, 100);
      c.fillOval(115, 125, 25, 25);
      c.fillOval(160, 125, 25, 25);
      c.drawLine(115, 180, 135, 160);
      c.drawLine(135, 160, 165, 160);
      c.drawLine(165, 160, 185, 180);
    }
    else if(mood.equals("Sad"))
    {
      c.setColor(Color.blue);
      c.fillOval(100, 100, 100, 100);
      c.setColor(Color.black);
      c.drawOval(100, 100, 100, 100);
      c.fillOval(115, 125, 25, 25);
      c.fillOval(160, 125, 25, 25);
      c.drawLine(115, 180, 135, 160);
      c.drawLine(135, 160, 165, 160);
      c.drawLine(165, 160, 185, 180);
    }
  }
}