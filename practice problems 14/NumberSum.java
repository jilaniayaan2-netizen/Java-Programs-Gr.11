import hsa.Console;

public class NumberSum 
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();
    
    int number; 
    c.print("Enter a number: ");
    number = c.readInt();
    
    sumOfInt(number);
  }
  public static void sumOfInt(int x)
  {
    int sum = 0; 
    int currentDigit = x%10;
    
    while(x != 0)
    { 
      currentDigit = x%10;
      sum += currentDigit;
      x = x/10; 
    }
    
    c.println(sum);
  }
}