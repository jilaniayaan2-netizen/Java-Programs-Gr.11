import hsa.Console;

public class YoureHowOld
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();    
    
    int CURRENT_YEAR =  2024; 
    int birthYear;
    
    c.print("Input birth year: "); 
    birthYear = c.readInt(); 
    
    int age = (CURRENT_YEAR - birthYear); 
    
    c.print("You are " + age + " years old.");
  }
}