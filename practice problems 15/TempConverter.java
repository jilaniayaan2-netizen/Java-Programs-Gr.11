import hsa.Console;

public class TempConverter
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();     
    
    String celsiusOrFarienheit; 
    int temperature; 
    int celsius = 0; 
    int farienheit = 0; 
    
    c.print("Enter 'F' or 'C' to choose if the temp you're inputing is celsius or farienheit: "); 
    celsiusOrFarienheit = c.readString(); 
    c.print("Enter the temperature: "); 
    temperature = c.readInt();
    
    if(celsiusOrFarienheit.equals("F"))
    {
      celsius = fahrenheitToCelcius(temperature); 
      c.print(celsius);
    }
    else 
    { 
      farienheit = celciusToFahrenheit(temperature);
      c.print(farienheit);
    }
  }
  public static int celciusToFahrenheit (int temp)
  { 
    int celsius = (temp*9/5) + 32;
    return celsius;
  }
  public static int fahrenheitToCelcius (int temp) 
  { 
    int farienheit = (temp - 32)*5/9;
    return farienheit;
  }
}