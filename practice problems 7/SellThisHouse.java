import hsa.Console;

public class SellThisHouse
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double housePrice = 496125;
    int weeksTakenToSell = 0;
    
    while(housePrice > 425000)
    { 
      housePrice = housePrice - (housePrice*0.03);
      ++weeksTakenToSell; 
    }
    c.print("It would take him " + weeksTakenToSell + " weeks to sell the house");
  }
}