import hsa.Console;

public class RectangleAnalysis
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double width;
    double length; 
    int option;
    
    c.print("User Input", 15); c.println("Option"); 
    c.print("1", 15); c.println("Dimensions of rectangle");
    c.print("2", 15); c.println("Perimeter of rectangle");
    c.print("3", 15); c.println("Area of rectangle");
    c.print("4", 15); c.println("Check if rectangle is a square");
    
    c.print("Enter width: ");
    width = c.readDouble(); 
    c.print("Enter length: ");
    length = c.readDouble(); 
    c.print("Enter option: ");
    option = c.readInt();
    
    switch(option)
    { 
      case 1: 
        c.print("The length of the rectangle is: " + length + " and the width is: " + width);
        break;
      case 2: 
        c.print("The perimeter of the rectangle is: " + (length*2 + width*2));
        break;
      case 3: 
        c.print("The area of the rectangle is: " + (length*width));
        break;
      case 4: 
        if(length == width)
        { 
          c.print("The rectangle is a sqaure");
        }
        else
        { 
          c.print("The rectangle is not a sqaure");
        } 
        break;
      default: 
        c.print("Invalid option");
    }
  }
}