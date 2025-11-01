// TemperatureConverter2
// Created by Ayaan Jilani 
// Last Modified 10/1/2024
//takes an input temperature in farienheit and converts it into celsius
import hsa.Console;

public class TemperatureConverter2
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();   // Output console
    
    double farienheit;      // Farienheit variable 
    
    // Getting user input 
    c.print("Input a farienheit value: ");
    farienheit = c.readDouble(); 
    
    // Caculate celsius 
    double celsius = (farienheit - 32)*5.0/9.0;
    
    // Output answer 
    c.print(farienheit + " degrees farienheit in celsius is " + celsius);
  }
}