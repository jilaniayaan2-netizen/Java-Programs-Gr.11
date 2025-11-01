// VolumeCalculator 
// Created by Ayaan Jilani
// Last Modified 10/1/24 
// caculates the volume of a cube using user input
import hsa.Console;

public class VolumeCalculator
{
  static Console c;                          // The output console  
 
  public static void main (String[] args) {
    c = new Console();
    
    double width;                            //The width 
    double height;                           // The height 
    double length;                           // The length
    
    // get user input 
    c.print("Enter wdith: ");
    width = c.readDouble(); 
    c.print("Enter height: ");
    height = c.readDouble(); 
    c.print("Enter length: ");
    length = c.readDouble(); 
    
    double volume = width * height * length; // The total volume
    
    // Output volume of cube 
    c.print("The volume of the cube is " + volume);
  }
}