import hsa.Console;

public class Cubing 
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();    
    
    double number;
    c.print("Enter a number to cube: "); 
    number = c.readInt(); 
    cubeIt(number);
  }  
  public static void cubeIt(double x)
  { 
    double num = Math.pow(x, 3); 
    c.print(num);
  }
}