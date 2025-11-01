import hsa.Console;

public class WhoDoYouThinkYouAre
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    String fullName = "Ayaan Jilani"; 
    int xValue = 500;
    int yValue = 400; 
    
    c.drawString(fullName, xValue, yValue);
  }
}