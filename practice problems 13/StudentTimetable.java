import hsa.Console;

public class StudentTimetable
{
  static Console c;
 
  public static void main (String[] args) 
  {
    c = new Console();  
    
    String[] timetable = new String[]{"World History", "Physics", "Lunch", "Functions", "Computer Science"}; 
    
    c.println("Ayaan's Timetable");
    c.println("Period 1: " + timetable[0]);
    c.println("Peroid 2: " + timetable[1]); 
    c.println("Peroid 3: " + timetable[2]); 
    c.println("Peroid 4: " + timetable[3]);
    c.println("Peroid 5: " + timetable[4]);
  }    
}