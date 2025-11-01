import hsa.Console;

public class WhatIsNDaddy
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int number1; 
    
    c.print("Enter a int between 1 and 10: ");
    number1 = c.readInt(); 
    
    switch(number1)
    { 
      case 1: 
        c.print("1");
        break; 
      case 2: 
        c.print("2");
        break;
      case 3: 
        c.print("2");
        break;
      case 4: 
        c.print("3");
        break;
      case 5: 
        c.print("3");
        break;
      case 6: 
        c.print("4");
        break;
      case 7:
        c.print("4");
        break;
      case 8: 
        c.print("5");
        break;
      case 9: 
        c.print("5");
        break;
      case 10:
        c.print("6");
        break;
      default: 
        c.print("Invalid input");
        break;
    }
  }
}