import hsa.Console;

public class MoreRectangleFun
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int height;
    int width; 
    int x; 
    int y;
    
    c.print("Enter height: ");
    height = c.readInt(); 
    c.print("Enter width: ");
    width = c.readInt(); 
    c.print("Enter x value for center of rectangle: ");
    x = c.readInt();
    c.print("Enter y value for center of rectangle: ");
    y = c.readInt();
    c.clear();
    
    c.drawRect(x, y, width, height);
  }
}