import hsa.Console;

public class DiscountCalculator
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double howMuchSpent; 
    double amountToPay;
    
    c.print("How much money did you spend: ");
    howMuchSpent = c.readDouble(); 
    
    if(100 <= howMuchSpent)
    { 
      amountToPay = (howMuchSpent - (howMuchSpent*0.15)) + (howMuchSpent*0.13);
    } 
    else
    {
      amountToPay = howMuchSpent + (howMuchSpent*0.13);
    }
    
    c.print("You have to pay $" + amountToPay);
  }
}