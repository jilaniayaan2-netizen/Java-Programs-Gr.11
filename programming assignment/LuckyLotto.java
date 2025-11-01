// Lucky Lotto 
// Created by Ayaan Jilani 
// Last modified 11/4/2024
// A lottery simulation game where students can play the lottery to win and lose storm points
import hsa.Console;

public class LuckyLotto
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();              // Creates console for output
    int numOfLotteryNums;           // will store how many lottery numbers player wants to be drawn 
    int luckyNum;                   // Will store what number play chooses 
    int lotteryNum;                 // Will store the lottery numbers
    int stormPoints = 100;          // Will store how mnany storm points the player has 
    String playAgain = "yes";       // Will store if the player would like to play again or not 
    String winOrLose = "Lose";      // Will store if the player won or loss
    int randomResponeGenerator;     // Will make a random number to randomize messages from the game
    
    // A while loop for each round
    while(playAgain.equals("yes") && stormPoints > 0)
    {  
      // Get input from user  
      c.print("Enter how many lottery numbers you want to be drawn(1 - 3): "); 
      numOfLotteryNums = c.readInt();  
      c.print("Enter your lucky number(1 - 10): "); 
      luckyNum = c.readInt(); 
      
      // Make for loop to draw a different lottery number each time
      for(int i = numOfLotteryNums; i > 0; --i)
      { 
        // Generate and output a new lottery number 
        lotteryNum = (int)(Math.random()* 10 + 1);
        c.println(lotteryNum);
        // If statement to check if the player won 
        if(luckyNum == lotteryNum)
        { 
          i = 0; 
          winOrLose = "Win";
        }
        else 
        { 
          winOrLose = "Lose";
        }
      }
      
      //Determine how many points the player wins or loses 
      if(winOrLose.equals("Win"))
      { 
        if(numOfLotteryNums == 1)
        { 
          c.println("You Win 100 Storm points"); 
          stormPoints += 100; 
        }
        else if(numOfLotteryNums == 2)
        { 
          c.println("You Win 50 Storm points"); 
          stormPoints += 50;
        }
        else 
        { 
          c.println("You Win 30 Storm points"); 
          stormPoints += 30;
        }
      } 
      else 
      { 
        c.println("You lost 20 storm points"); 
        stormPoints -= 20; 
      } 
      
      // Display the player's current score 
      c.println("You have " + stormPoints + " Storm Points."); 
      
      // Check to see if we can prompt the player for another round
      if(stormPoints <= 0)
      { 
        // Generate random num for response
        randomResponeGenerator = (int)(Math.random()*10 + 1); 
        
        // Choose a response based on response
        if(randomResponeGenerator <= 5)
        { 
          c.println("Game over");  
        }
        else 
        {
          c.println("Not very good at gambling are you?");
        }
      }
      else 
      { 
        // Get user input
        c.print("Would you like to play again? Enter 'yes' or 'no': "); 
        playAgain = c.readString(); 
      }
    }
    // Generate random number for response
    randomResponeGenerator = (int)(Math.random()*10 + 1);
    
    // Choose response based on random num 
    if(randomResponeGenerator <= 5)
    { 
      c.println("Thank you for playing you have: " + stormPoints + " Storm Points. Next time keep on gambeling"); 
    }
    else 
    { 
      c.println("I thought gambelers never quit? Well you have " + stormPoints + " Storm points.");
    }
    
  }//niam 
}//ottoLykcuL