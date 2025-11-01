import hsa.Console;

public class Calculator
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double num1; 
    double num2;
    
    c.print("Enter a number: ");
    num1 = c.readDouble(); 
    c.print("Enter a second number: ");
    num2 = c.readDouble(); 
    
    double totalNum = num1 + num2; 
    double differenceNum = num1 - num2; 
    double productNum = num1 * num2;
    double quotientNum = num1 / num2;
    
    c.print(num1); c.print(" + "); c.print(num2); c.print(" = "); c.println(totalNum);
    c.print(num1); c.print(" - "); c.print(num2); c.print(" = "); c.println(differenceNum);
    c.print(num1); c.print(" * "); c.print(num2); c.print(" = "); c.println(productNum);
    c.print(num1); c.print(" / "); c.print(num2); c.print(" = "); c.println(quotientNum);
  }
}