import hsa.Console;

public class LargestSmallestValue 
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();
    
    int num1; 
    int num2;
    int largestNum;
    int smallestNum;
    
    c.print("Enter a number: ");
    num1 = c.readInt();
    c.print("Enter a number: ");
    num2 = c.readInt();
    
    if(num1 > num2)
    {
      largestNum = num1;
      smallestNum = num2;
    }
    else
    {
      largestNum = num2;
      smallestNum = num1;
    }
    
    c.println("The larger number is " + largestNum);
    c.println("The smaller number is " + smallestNum);
  }
}