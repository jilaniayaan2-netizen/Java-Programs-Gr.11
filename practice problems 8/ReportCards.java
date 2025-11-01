import hsa.Console;

public class ReportCards
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    double numberOfStudents;
    double percentOfStudentsPassing = 0;
    double goodStudents = 0; 
    
    c.print("Enter how many students are in your class: ");
    numberOfStudents = c.readInt(); 
    
    for(int i = 1; i <= numberOfStudents; i++)
    {
      int grades; 
      c.print("Enter one grade: ");
      grades = c.readInt(); 
      
      if(grades >= 50)
      { 
        goodStudents++; 
      }
    }
    percentOfStudentsPassing = (goodStudents/numberOfStudents)*100; 
    c.print("The percentage of people passing is "); c.print(percentOfStudentsPassing, 2, 2); c.print("%.");
  }
}