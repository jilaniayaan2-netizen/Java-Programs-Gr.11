import hsa.Console;

public class TheIrritableMagic8Ball
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    String question;
    String generatedAnswer = " ";
    double randomNum = Math.random()*1.0;
    
    c.print("How do you feel today? Enter Happy, Angry, or Sad: ");
    question = c.readString(); 
    
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
    
    if(question.equals("Happy"))
    {
      if(generatedAnswer.equals("yes"))
      { 
        c.print("Have a nice day!");
      }
      if(generatedAnswer.equals("no"))
      { 
        c.print("I dont care, you bother me too much");
      }
      if(generatedAnswer.equals("maybe"))
      { 
        c.print("Nice");
      }
    }
    else if(question.equals("Angry"))
    { 
      if(generatedAnswer.equals("yes"))
      { 
        c.print("Why are you angry?");
      }
      if(generatedAnswer.equals("no"))
      { 
        c.print("Definitely not – You bother me too much!");
      }
      if(generatedAnswer.equals("maybe"))
      { 
        c.print("I don't really care man");
      }
    }
    else if(question.equals("Sad"))
    { 
      if(generatedAnswer.equals("yes"))
      { 
        c.print("I hope you feel better");
      }
      if(generatedAnswer.equals("no"))
      { 
        c.print("Stay sad lol");
      }
      if(generatedAnswer.equals("maybe"))
      { 
        c.print("hope you feel better, i guess?");
      }
    }
  }
}