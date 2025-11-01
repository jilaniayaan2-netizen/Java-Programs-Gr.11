// TemperatureConverter
// Created by Ayaan Jilani 
// Last Modified 10/1/24
// takes an input temperature in celsius and converts it into farienheit
import hsa.Console;

public class TemperatureConverter
{
  static Console c;    
 
  public static void main (String[] args) {
    c = new Console();   // The output console 
    
    double celsius;      // Celsius variable 
    
    // Getting user input 
    c.print("Input a celsius value: ");
    celsius = c.readDouble(); 
    
    // Caculate farienheit 
    double farienheit = (9.0/5.0)*celsius + 32; 
    
    // Output answer 
    c.print(celsius + " degrees celsius in farienheit is " + farienheit);
  }
}