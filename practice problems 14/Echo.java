import hsa.Console;

public class Echo 
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();     
    
    String userName; 
    int numRepeat; 
    
    c.print("Enter your name: "); 
    userName = c.readLine(); 
    c.print("Enter how many times to repeat: "); 
    numRepeat = c.readInt(); 
    echo(userName, numRepeat);
    
  }
  public static void echo(String name, int x)
  { 
    for(int i = 0; i < x; ++i)
    { 
      c.println(name);
    }
  }
}