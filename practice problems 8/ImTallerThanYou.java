import hsa.Console;

public class ImTallerThanYou
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double heights = 0;
    double totalHieght = 0; 
    double averageHeight = 0; 
    double shortestHeight = 0; 
    double tallestHeight = 0; 
    int counter = 0; 
    
    c.println("Enter a height in cm(This will be continued to"); c.print(" be asked until you enter a negative): ");
    heights = c.readDouble();
    
    while(heights >= 0)
    { 
        totalHieght += heights; 
        tallestHeight = Math.max(tallestHeight, heights); 
        
        if(shortestHeight == 0)
        { 
          shortestHeight = heights;
        }
        
        shortestHeight = Math.min(shortestHeight, heights); 
        ++counter; 
        c.println("Enter a height in cm(This will be continued to"); c.print(" be asked until you enter a negative): ");
        heights = c.readDouble();
    }
    averageHeight = totalHieght/counter;
    
    c.print("The average height is "); c.print(averageHeight, 2, 2); c.println("cm.");
    c.print("The tallest height is "); c.print(tallestHeight, 2, 2); c.println("cm."); 
    c.print("The shortest height is "); c.print(shortestHeight, 2, 2); c.println("cm.");
  }
}