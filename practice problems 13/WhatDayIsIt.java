import hsa.Console;

public class WhatDayIsIt
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();
    
    String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int userInput; 
    
    c.print("Enter a number from 1-7: "); 
    userInput = c.readInt(); 
    while(userInput > 0 && userInput < 7)
    { 
      c.println(daysOfWeek[userInput-1]); 
      c.print("Enter a number from 1-7 or enter a number out of this range: "); 
      userInput = c.readInt(); 
    }
  }    
}