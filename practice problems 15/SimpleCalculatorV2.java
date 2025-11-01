import hsa.Console;

public class SimpleCalculatorV2
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();  
    
    int answer = 0; 
    int num1 = inputNumber(); 
    int num2 = inputNumber();
    String sign = inputSign();
    char symbol = sign.charAt(0);
    
    if(symbol == '+')
    { 
      answer = addition(num1, num2);
    }
    else if(symbol == '-')
    { 
      answer = subtraction(num1, num2); 
    }
    else if(symbol == '*')
    { 
      answer = multiplication(num1, num2);
    }
    else if(symbol == '/')
    { 
      answer = division(num1, num2); 
    }
    else 
    { 
      answer = modulus(num1, num2); 
    }
    
    output(num1, symbol, num2, answer);
  }    
  public static int inputNumber ( )
  { 
    int num;
    c.print("Enter a number: "); 
    num = c.readInt(); 
    return num;
  }
  public static String inputSign( )
  { 
    String sign;
    c.print("Enter '+', '-', '*', '/', or '%': ");
    sign = c.readString();
    return sign;
  }
  public static int addition (int a, int b)
  { 
    int sum = a+b; 
    return sum;
  }
  public static int subtraction (int a, int b)
  {
    int difference = a-b;
    return difference; 
  }
  public static int multiplication (int a, int b)
  {
    int product = a*b; 
    return product; 
  }
  public static int division (int a, int b) 
  {
    int qoutiant = a/b; 
    return qoutiant; 
  }
  public static int modulus (int a, int b)
  { 
    int mod = a%b; 
    return mod;
  }
  public static void output (int a, char op, int b, int answer)
  { 
    c.print(a + " " + op + " " + b + " " + "=" + " " + answer);
  }
}