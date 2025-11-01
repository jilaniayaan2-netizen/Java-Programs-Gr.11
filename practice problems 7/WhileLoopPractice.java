import hsa.Console;

public class WhileLoopPractice
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int a = 1; 
    int b = 1; 
    int partC = 10; 
    int d = 18; 
    int e = 20; 
    
    c.println("Part A");
    while(a <= 10)
    { 
      c.println(a);
      a++; 
    }
    
    c.println("Part B");
    while(b <= 10)
    { 
      ++b;
      c.println(b);
      ++b;
    } 
    
    c.println("Part C");
    while(partC >= 1)
    { 
      c.println(partC);
      --partC; 
    } 
    
    c.println("Part D");
    while(d >= 12)
    { 
      --d;
      c.println(d);
      c.println();
      --d; 
    }
    
    c.println("Part E");
    while(e <= 30)
    { 
      c.print(e + " "); 
      ++e;
    }
  }
}