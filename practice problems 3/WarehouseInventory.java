import hsa.Console;

public class WarehouseInventory
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int openingInventory = 26550; 
    int inventoryAdded = 18625;
    int inventoryTotalBeforeSales = openingInventory + inventoryAdded;
    double inventoryLost = (double)(openingInventory)*0.02;
    int inventorySold = 15045;
    double totalYearEndInventory = inventoryTotalBeforeSales - (inventoryLost + inventorySold);
    
    c.print("Opening Inventory:", 30); c.println(openingInventory, 2);
    c.print("Inventory Added:", 30); c.println(inventoryAdded, 2);
    c.print("Total Inventory before sales:", 30); c.println(inventoryTotalBeforeSales, 2);
    c.print("Inventory lost or damaged:", 30); c.println((int)(inventoryLost), 5);
    c.print("Inventory sold:", 30); c.println(inventorySold, 2);
    c.print("Total end of year inventory:", 30); c.print((int)(totalYearEndInventory), 2); 
  }
}