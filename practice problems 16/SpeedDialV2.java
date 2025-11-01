import hsa.Console;

public class SpeedDialV2
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console(); 
    
    String[] phoneNum = new String[10];
    int userInput;
    int location = 0; 
    String phoneNumber = "";
    String check = ""; 
    
    c.println("1 - enter a number\n2 - dial a number\n3 - exit");
    userInput = c.readInt(); 
    
    while(userInput <= 3)
    { 
      while(userInput != 3)
      {
       if(userInput == 1)
       { 
         while(!check.equals("true"))
         {
           c.print("Enter the location of your number(0-9): "); 
           location = c.readInt();
           if(location < 0 || location > 9)
           {
             c.print("Invalid input, try again");
             check = "false";
           }
           else 
           {
             c.print("Enter the phone number: "); 
             phoneNumber = c.readLine();  
             phoneNum[location] = phoneNumber;
             check = "true";
           }
         }
       }
       check = "";
       if(userInput == 2)
       {
         while(!check.equals("true"))
         {
           c.print("Enter the speed dial number(0-9): "); 
           location = c.readInt();
           if(location < 0 || location > 9)
           { 
             c.println("Invalid input");
             check = "";
           }
           else if(phoneNum[location].equals(null))
           {
             c.println("There is no current number stored in ...");
             check = "";
           }
           else 
           {
             c.println("Dialing " + phoneNum[location]);
             check = "true";
           }
         }
       }
      }
      c.println("1 - enter a number\n2 - dial a number\n3 - exit");
      userInput = c.readInt();
    }
    c.close();
  }    
}