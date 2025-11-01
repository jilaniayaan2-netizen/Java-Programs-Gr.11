import hsa.Console;

public class Marks2
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int marks = 0;
    int totalMarks = 0;
    double averageMarks = 0;
    int counter = 0;
    String markAorMarkB; 
    c.println("Enter 'Mark A' if you want to enter the number of students"); 
    c.print("or enter 'Mark B' to enter marks: ");
    markAorMarkB = c.readLine(); 
    
    if(markAorMarkB.equals("Mark A"))
    {
      int numOfStudents; 
      c.print("How many students are there in your class: ");
      numOfStudents = c.readInt(); 
      for(int i = 1; i <= numOfStudents; ++i)
      { 
        c.print("Enter a mark: ");
        marks = c.readInt();
        totalMarks += marks; 
      }
      averageMarks = totalMarks/numOfStudents; 
      c.print("The average mark of the students is " + averageMarks);
    }
    else if(markAorMarkB.equals("Mark B"))
    { 
      c.print("Enter a mark, to stop entering marks, enter a negative number: "); 
      marks = c.readInt(); 
      while(marks >= 0)
      {
        totalMarks += marks; 
        counter += 1;
        c.print("Enter a mark, to stop entering marks, enter a negative number: "); 
        marks = c.readInt(); 
      } 
      averageMarks = totalMarks/counter; 
      c.print("The average mark of the students is " + averageMarks);
    }
  }
}