import hsa.Console;

public class ArrayFun
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console(); 
    
    int size; 
    int minRange; 
    int maxRange; 
    
    c.print("Enter the size of the array: "); 
    size = c.readInt(); 
    c.print("Enter the low end of the array: "); 
    minRange = c.readInt(); 
    c.print("Enter the high end of the array: "); 
    maxRange = c.readInt();
    
    int [] randomNumbers = randomArray(size, minRange, maxRange);
    int arrayMax = maxValue(randomNumbers); 
    int arrayMin = minValue(randomNumbers);
    int arrayRange = arrayRange(randomNumbers);
    int arraySum = arraySum(randomNumbers);
    int arrayAverage = arrayAverage(randomNumbers);
    
    printArray(randomNumbers);
    c.println("The max value is " + arrayMax + ", the min value is " + arrayMin + " and the range is " + arrayRange); 
    c.println("The sum of all the numbers in the array is " + arraySum); 
    c.println("The average of all the numbers in the array is " + arrayAverage);
  }
  public static int [] randomArray (int arraySize, int lowRange, int highRange)
  { 
    int[] randomNums = new int[arraySize];
    int randomNumber = 0; 
    for(int x = 0; x <= randomNums.length-1; ++x)
    { 
      randomNumber = (int)(Math.random()*lowRange + highRange);
      randomNums[x] = randomNumber;
    }
    return randomNums;
  }
  public static int arraySum (int inputArray [])
  {
    int sum = 0; 
    for(int x = 0; x <= inputArray.length-1; ++x)
    { 
      sum += inputArray[x];
    }
    return sum; 
  }
  public static int maxValue (int inputArray [])
  {
    int maxNum = 0; 
    for(int x = 0; x <= inputArray.length-1; ++x)
    {
      maxNum = Math.max(maxNum, inputArray[x]); 
    }
    return maxNum;
  }
  public static int minValue (int inputArray [])
  {
    int minNum = 0; 
    for(int x = 0; x <= inputArray.length-1; ++x)
    {
      if(minNum == 0)
      {
        minNum = inputArray[x];
      }
      minNum = Math.max(minNum, inputArray[x]); 
    }
    return minNum;
  }
  public static int arrayRange (int inputArray [])
  {
    int range = 0; 
    int minNum = 0; 
    int maxNum = 0; 
    for(int x = 0; x <= inputArray.length-1; ++x)
    {
      if(minNum == 0)
      {
        minNum = inputArray[x];
      }
      minNum = Math.max(minNum, inputArray[x]); 
      maxNum = Math.max(maxNum, inputArray[x]);
    }
    range = maxNum - minNum; 
    return range;
  }
  public static int arrayAverage  (int inputArray [])
  {
    int averageNum = 0; 
    int totalSum = 0; 
    int counter = 0; 
    for(int x = 0; x <= inputArray.length-1; ++x)
    {
      totalSum += inputArray[x]; 
      counter++;
    }
    averageNum = totalSum/counter;
    return averageNum;
  }
  public static void printArray (int inputArray []) 
  { 
    for(int x = 0; x <= inputArray.length-1; ++x)
    {
      c.print(inputArray[x] + " ");
    }
    c.println();
  }
}