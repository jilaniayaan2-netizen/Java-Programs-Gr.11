import hsa.Console;

public class LargestandSmallest
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();   
    
    int[] nums;
    int counter = 0;
    int storageSpace; 
    int totalNum = 0;
    int currentNum = 0;
    int averageNum = 0; 
    int biggestNum = 0; 
    int smallestNum = 0; 
    
    c.print("Enter how many numbers do you want to store in the array: ");
    storageSpace = c.readInt();
    
    nums = new int[storageSpace];
    
    for(int x = 0; x <= nums.length-1; ++x)
    { 
      c.print("Enter a number: ");
      nums[x] = c.readInt();
    } 
    
    for(int x = 0; x <= nums.length-1; ++x)
    { 
      currentNum = nums[x];
      biggestNum = Math.max(biggestNum, currentNum);  
      if(smallestNum == 0)
      { 
        smallestNum = currentNum;
      }  
      smallestNum = Math.min(smallestNum, currentNum);
      totalNum += currentNum;
      counter++;
    } 
    
    averageNum = totalNum/counter; 
    c.println("The biggest num is " + biggestNum); 
    c.println("The smallest num is " + smallestNum); 
    c.println("The average num is " + averageNum);
  }    
}