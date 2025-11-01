// SpongeBob SquareHouse
// Created by Ayaan Jilani 
// Last Modified 10/7/2024 
// Creates a house for spongebob that has 2 floors, 1 window and 1 door
import hsa.Console;

public class SpongeBobSquareHouse
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console(); // The output console

    double mainFloorDiameter;            // Stores diameter of the main floor in feet
    double mainFloorArea;                // Stores the area of the main floor in feet sqaured 
    double mainFloorCircumference;       // Stores circumference of the main floor in feet
    double mainFloorRadius;              // Stores the radius of the main floor
    int secondFloorLength;               // Will store Gary's input of window length in feet
    String adress;                       // Will store Gary's input of the house's adress 
    int PIXELS_PER_FOOT = 14;            // Stores 1 foot = 14 pixels 
    int middleWidth = c.getWidth()/2;    // Stores halfway point of width 
    int middleHeight = c.getHeight()/2;  // Stores halfway point of height
    int windowLength;                    // Will store a random number for window length
    
    // Get input and then clear console 
    c.print("Enter the diameter of the main floor: ");
    mainFloorDiameter = c.readInt(); 
    c.print("Enter the length of the second floor: ");
    secondFloorLength = c.readInt();
    c.print("Enter the adress: ");
    adress = c.readLine();
    c.clear(); 
    
    // Draw main floor and caculate area and circumference
    c.drawOval(middleWidth - (int)(mainFloorDiameter*14)/2, middleHeight - (int)(mainFloorDiameter*PIXELS_PER_FOOT)/2, 
               (int)(mainFloorDiameter*PIXELS_PER_FOOT), (int)(mainFloorDiameter*PIXELS_PER_FOOT));
    mainFloorRadius = mainFloorDiameter/2;
    mainFloorCircumference = 2*3.14*mainFloorRadius;
    mainFloorArea = 3.14*Math.pow(mainFloorRadius, 2);
    
    // Draw second floor
    c.drawRect(middleWidth - secondFloorLength*PIXELS_PER_FOOT/2, 
               middleHeight - secondFloorLength*PIXELS_PER_FOOT/2 - secondFloorLength*PIXELS_PER_FOOT, 
               secondFloorLength*PIXELS_PER_FOOT, secondFloorLength*PIXELS_PER_FOOT);
    
    // Draw window
    windowLength = (int)Math.random()*1+100;
    c.drawStar(middleWidth - windowLength/2, middleHeight - windowLength - windowLength, windowLength, windowLength); 
    
    // Draw Door
     c.drawMapleLeaf(middleWidth - 3*PIXELS_PER_FOOT/2, middleHeight - 6*PIXELS_PER_FOOT + (int)(mainFloorDiameter*7), 
                     3*PIXELS_PER_FOOT, 6*PIXELS_PER_FOOT); 
     
    // Output the house information
     c.setCursor(20, 30);
     c.print("Adress:", 30);
     c.print(adress);
     c.setCursor(21, 30);
     c.print("Perimeter of first floor:", 30);
     c.print(mainFloorCircumference, 2, 2);
     c.setCursor(22, 30);
     c.print("sqaure ft of first floor:", 30);
     c.print(mainFloorArea, 2, 2);
     c.setCursor(23, 30);
     c.print("range of random nnumbers:", 30);
     c.print("1-100");
  }//niam
}//esuoHerauqSboBegnopS