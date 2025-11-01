import hsa.Console;

public class TemperatureConverter2point0
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    for(int celsius = 0; celsius <= 100; celsius += 10)
    { 
      double f = (9.0/5.0)*celsius + 32;
      c.print(celsius + " Celsius = ", 11); c.println(f + " Farienheit"); 
    }
  }
}