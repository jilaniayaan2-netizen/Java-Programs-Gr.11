import hsa.Console;

public class WhosFaster
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double distanceRun1; 
    double timeRun1; 
    double distanceRun2; 
    double timeRun2;
    
    c.print("Enter distance ran of person 1 in meters: "); 
    distanceRun1 = c.readDouble(); 
    c.print("Enter time spent running of person 1 in seconds: ");
    timeRun1 = c.readDouble();
    
    c.print("Enter distance ran of person 2 in meters: "); 
    distanceRun2 = c.readDouble(); 
    c.print("Enter time spent running of person 2 in seconds: ");
    timeRun2 = c.readDouble();
    
    double speed1 = distanceRun1/timeRun1;
    c.println("The speed of person 1 is " + speed1 + "m/s");
    double speed2 = distanceRun2/timeRun2;
    c.println("The speed of person 1 is " + timeRun2 + "m/s");
    
    double fasterPerson = Math.max(speed1, speed2);
    c.print("The faster person had a speed of " + fasterPerson);
  }
}