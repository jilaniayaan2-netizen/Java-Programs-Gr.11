// NewYearResolutions
// Created by Ayaan Jilani 
// Last modified 12/16/2024
// The program allows the user to input the number of guests coming to the New Year's Eve party and get the resolutions 
// of all the guests.
import hsa.Console;

public class NewYearResolutions
{
  static Console c; 
 
  public static void main (String[] args) 
  {
    c = new Console();          // Creates the console 
    int numOfGuests;            // Stores the number of guests that the user enters 
    String[] listOfResolutions; // Stores the resolutions of all the guests  
    int positions = 0;          // Stores the position the user wants to input a resolution at
    String resolution;          // Will store the resolution that the user wants to check for in the list
    boolean inListOrNot;        // Stores if the resolution that the user wants is in the list or not
    
    // Give the value of the user's input from inputPartySize to numOfGuests
    numOfGuests = inputPartySize();
    
    // Assign the number of guests to the number of items in listOfresolutions 
    listOfResolutions = new String[numOfGuests]; 
    
    // Get the resolutions of all the guests 
    for(int x = 0; x <= listOfResolutions.length-1; ++x)
    {
      listOfResolutions = addResolution(listOfResolutions, x);
    }
    
    // Clear screen 
    c.clear(); 
    
    // Get user input 
    c.print("Enter a resolution to check for from the resolution list: "); 
    resolution = c.readLine(); 
    
    // Check if user's input is in list
    inListOrNot = findResolution(listOfResolutions, resolution);
    if(inListOrNot == true)
    {
      c.println(resolution + " is in the list of resolutions.");
    }
    else 
    {
      c.println(resolution + " is not in the list of resolutions.");
    }
    
    // Output all the resolutions 
    displayResolutions(listOfResolutions);
    
  }//niam

  // Gets and validates input from the user and returns number of guests
  public static int inputPartySize()
  {
    String numOfGuestsStr;     // This will be used to make sure the user entered a integer
    int numberOfGuests = 0;    // Stores how many guests are coming to the party 
    String check = "false";    // Will be used to validate our data 
    
    // If the user's input is invalid, then it will run this loop to ask for a new value
    while(check.equals("false"))
    { 
      // Get Input from user
      c.print("Enter the number of guests coming to the party(10-20): "); 
      numOfGuestsStr = c.readLine();
      
      // Try to convert the input to a integer
      try
      { 
         numberOfGuests = Integer.parseInt(numOfGuestsStr); 
         
         // Check if the value given is in the range of 10-20
         if(numberOfGuests < 10 || numberOfGuests > 20)
         {
           c.println(numOfGuestsStr + " is an invalid input. Try again.");
           check = "false";
         }
         else
         {
           check = "true";
         }
      }
      // Catch if the value cannot be converted to an integer
      catch(NumberFormatException e)
      {
        c.println(numOfGuestsStr + " is an invalid input. Try again.");
        check = "false";
      }
    }
    return numberOfGuests;
  }//eziSytraPtupnI
  
  // Allows the user to add resolutions to the list and it will return the updated list of resolutions 
  public static String[ ] addResolution (String[] resolutions, int position)
  {
    // Get userinput 
    c.print("Enter your resolution for guest " + (position+1) + ": "); 
    resolutions[position] = c.readLine();
    return resolutions; 
  }//noituloseRddA
  
  // Checks whether a specific resolution was given and returns true or false 
  public static boolean findResolution(String[ ] resolutions, String resolution)
  {
    boolean trueOrFalse = false;  // Will store if the specfic resolutions exists in the list
    
    // The for loop will run through the entire array to see if there is a matching resolution
    for(int x = 0; x <= resolutions.length-1; ++x)
    {
      if(resolutions[x].equals(resolution))
      {
        trueOrFalse = true; 
        break;
      }
      else 
      {
        trueOrFalse = false; 
      }
    }
    return trueOrFalse; 
  }//noituloseRdnif
  
  // Prints out the resolutions, line by line 
  public static void displayResolutions(String[ ] resolutions)
  {
    for(int x = 0; x <= resolutions.length-1; ++x)
    {
      c.println(resolutions[x]);
    }
  }//snoituloseRyalpsid
}//snoituloseRreaYweN