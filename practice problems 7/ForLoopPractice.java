import hsa.Console;

public class ForLoopPractice
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();
    
    c.println("Part A:");
    for(int i = 1; i <= 10; i++)
    { 
      c.println(i);
    }
    c.println("Part B:");
    for(int i = 1; i <= 10; i++)
    { 
      c.println(++i);
    }
    c.println("Part C:");
    for(int i = 10; i >= 1; i = i-1)
    { 
      c.println(i);
    }
    c.println("Part D:");
    for(int i = 18; i >= 12; i--)
    { 
      c.println(i);
      c.println();
    }
    c.println("Part E:");
    for(int i = 20; i <= 30; i++)
    { 
      c.print(i + " ");
    }
  }
}