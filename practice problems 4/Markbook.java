import hsa.Console;

public class Markbook
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double mark1;
    double mark2;
    double mark3;
    double mark4; 
    
    c.print("Enter first mark: ");
    mark1 = c.readDouble();
    c.print("Enter second mark: ");
    mark2 = c.readDouble();
    c.print("Enter third mark: ");
    mark3 = c.readDouble();
    c.print("Enter fourth mark: ");
    mark4 = c.readDouble();
    
    double averageMark = (mark1 + mark2 + mark3 + mark4)/4;
    
    c.print("Your marks are " + mark1 + ", " + mark2 +  ", " + mark3 + ", " + mark4 + " ."); 
    c.print("The average mark of all these is " + averageMark + ".");
  }
}