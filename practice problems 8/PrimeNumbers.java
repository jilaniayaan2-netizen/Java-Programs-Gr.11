import hsa.Console;

public class PrimeNumbers
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int x;
    boolean isPrime = true;
    
    c.print("Enter a number: ");
    x = c.readInt(); 
    
    for(int i = x - 1; i > 1; i--)
    {
      if(x%i == 0)
      { 
        isPrime = false; 
      }
    }
    if(isPrime)
    { 
      c.print(x + " is a prime number.");
    }
    else 
    { 
      c.print(x + " is not a prime number.");
    }
} 
}