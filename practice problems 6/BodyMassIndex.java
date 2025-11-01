import hsa.Console;

public class BodyMassIndex
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double weight;
    double height; 
    double bmi;
    
    c.println("BMI Category Message:");
    c.println("     More than 25: Overweight");
    c.println("     Between 18.5 and 25.0 (inclusive): Normal Weight");
    c.println("     Less than 18.5: Underweight"); 
    
    c.print("Enter weight in kilos: ");
    weight = c.readDouble(); 
    c.print("Enter height in meters: ");
    height = c.readDouble(); 
   
    bmi = weight/(height*height); 
    
    if(bmi > 25)
    {
      c.print("Overweight");
    }
    else if(bmi < 25 && bmi > 18.5)
    { 
      c.print("Normal Weight");
    }
    else if(bmi < 18.5)
    { 
      c.print("Underweight");
    }
  }
}