import hsa.Console;

public class Echo
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int amountOfNum = 0;
    int y = 1;
    int x = 1;
    int i = 0; 
    
    while(amountOfNum <= 5)
    {  
      c.setCursor(y++, 1);
      c.print("Enter a number(1 - 10): "); 
      i = c.readInt(); 
      
      if(i <= 10 && i >= 0)
      { 
        c.setCursor(25, x+=10);
        c.print(i);
        amountOfNum++; 
      }
      else 
      { 
        c.print("Invalid input");
        amountOfNum = 6;
      }
    }
  }
}