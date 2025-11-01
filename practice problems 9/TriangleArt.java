import hsa.Console;

public class TriangleArt
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int userAmount; 
    c.print("Input the number of *'s in the first row of the triangle: ");
    userAmount = c.readInt();
    
    for(int i = userAmount; i >= 0; --i)
    { 
      for(int x = 0; x <= i; ++x)
      { 
        c.print("*");
      }
      c.println();
    }
  }
}