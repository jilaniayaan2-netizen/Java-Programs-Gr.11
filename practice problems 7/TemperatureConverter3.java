import hsa.Console;

public class TemperatureConverter3
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int x;
    int y;
    
    c.print("Enter a temp in degrees celsius: ");
    x = c.readInt();
    c.print("Enter a temp in degrees celsius: ");
    y = c.readInt();
    
    for(int celsius = x; celsius <= y; celsius += 10)
    { 
      double f = (9.0/5.0)*celsius + 32;
      c.print(celsius + " Celsius = ", 11); c.println(f + " Farienheit"); 
    }
  }
}