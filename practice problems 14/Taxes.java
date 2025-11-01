import hsa.Console;

public class Taxes 
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();   
    
    double price; 
    c.print("Enter the price of an item: "); 
    price = c.readInt(); 
    
    tax(price);
  }
  public static void tax(double cost)
  {
    double hst = cost*0.13; 
    double totalPrice = cost + hst; 
    c.print("The hst is $");
    c.println(hst, 1, 2); 
    c.print("The total price is $");
    c.println(totalPrice, 1, 2);
  }
}