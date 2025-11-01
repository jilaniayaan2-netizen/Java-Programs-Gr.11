import hsa.Console;

public class Template
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console(); 
    
    c.print((int)(Math.random()*3+1));
  }    
}