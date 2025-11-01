import hsa.Console;

public class CountingFun
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int x; 
    int y; 
    
    c.print("Enter a num: ");
    x = c.readInt();
    c.print("Enter another num: ");
    y = c.readInt(); 
    
    for(int i = x; i <= y; i++)
    { 
      c.println(i);
    }
    for(int i = x + 1; i < y; i++)
    { 
      c.println(i);
    }
    for(int i = x; i <= y; i++)
    { 
      c.println(++i);
    }
    for(int i = x + 1; i <= y; i++)
    { 
      c.println(i++);
    }
  }
}