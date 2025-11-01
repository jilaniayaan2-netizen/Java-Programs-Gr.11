import hsa.Console;

public class GradeConverter
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    int numberGrade;
    String letterGrade;
    
    c.print("Enter grade: ");
    numberGrade = c.readInt(); 
    int firstDig = numberGrade/10;
    
    switch(firstDig){ 
      case 9:
        letterGrade = "A+";
        break;
      case 8:
        letterGrade = "A";
        break;
      case 7: 
        letterGrade = "B";
        break;
      case 6:
        letterGrade = "C";
        break;
      case 5: 
        letterGrade = "D";
        break;
      case 0: case 1: case 2: case 3: case 4:
        letterGrade = "f";
        break; 
      default: 
        letterGrade = "invalid grade";
        break; 
    } 
    
    c.print("Your letter grade is " + letterGrade);
  }
}