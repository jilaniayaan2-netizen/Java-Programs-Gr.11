import hsa.Console;

public class MyFavouriteNumbers
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();  
    
    int[] favoriteNums; 
    int[] biggerNums;
    int howManyNums; 
    int biggestNum = 0; 
    int smallestNum = 0;
    int currentNum = 0;
    int randomNum = 0;
    int counter = 0;
    int i = 0;
    
    c.print("How many favorite numbers do you have: "); 
    howManyNums = c.readInt(); 
    favoriteNums = new int[howManyNums];
    
    for(int x = 0; x <= favoriteNums.length-1; ++x)
    { 
      c.print("Enter one of your favorite numbers: "); 
      favoriteNums[x] = c.readInt();  
    }
    
    for(int x = 0; x <= favoriteNums.length-1; ++x)
    { 
      currentNum = favoriteNums[x];
      biggestNum = Math.max(biggestNum, currentNum);  
      if(smallestNum == 0)
      { 
        smallestNum = currentNum;
      }  
      smallestNum = Math.min(smallestNum, currentNum);
    } 
    
    randomNum = (int)(Math.random()*biggestNum + smallestNum);
    for(int x = 0; x <= favoriteNums.length-1; ++x)
    { 
      if(favoriteNums[x] >= randomNum)
      { 
        counter++;
      }
    }
    
    biggerNums = new int[counter];
    for(int x = 0; x <= favoriteNums.length-1; ++x)
    { 
      if(favoriteNums[x] >= randomNum)
      { 
        ++i;
        biggerNums[i] = favoriteNums[x];
      }
    }
    
    for(int x = 0; x <= biggerNums.length-1; ++x)
    { 
      c.println(biggerNums[x]);
    }
  }    
}