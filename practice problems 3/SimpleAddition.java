import hsa.Console;

public class SimpleAddition
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int number1 = 932;
    int number2 = 867;
    int totalNum = number1 + number2;
    
    c.print(number1);
    c.print(" + ");
    c.print(number2);
    c.print(" = ");
    c.print(totalNum);
  }
}