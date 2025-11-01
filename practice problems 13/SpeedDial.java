import hsa.Console;

public class SpeedDial
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();
    
    String[] phoneNum = new String[10];
    int userInput;
    int location = 0; 
    String phoneNumber = "";
    
    c.println("1 - enter a number\n2 - dial a number\n3 - exit");
    userInput = c.readInt(); 
    
    while(userInput != 3)
    { 
       if(userInput == 1)
       { 
         c.print("Enter the location of your number(0-9): "); 
         location = c.readInt(); 
         c.print("Enter the phone number: "); 
         phoneNumber = c.readLine();  
         phoneNum[location] = phoneNumber;
       }
       else
       { 
         c.print("Enter the speed dial number(0-9): "); 
         location = c.readInt(); 
         if(phoneNum[location].equals(null))
         { 
           c.println("There is no current number stored in ..."); 
         }
         else 
         { 
           c.println("Dialing " + phoneNum[location]); 
         }
       }
       c.println("1 - enter a number\n2 - dial a number\n3 - exit");
       userInput = c.readInt();
    }
    c.close(); 
  }    
}