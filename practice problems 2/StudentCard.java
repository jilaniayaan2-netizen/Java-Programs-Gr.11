import hsa.Console;

public class StudentCard
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();

    c.drawRect(100, 100, 300, 150);
    c.drawOval(125, 150, 50, 50);
    c.drawLine(125, 175, 175, 175);
    c.drawLine(150, 150, 150, 200);
    c.setCursor(7, 25);
    c.print("Rick Hansen SS");
    c.setCursor(9, 24); 
    c.print("Student Name:", 14);
    c.print("Ayaan Jilani");
    c.setCursor(10, 24);
    c.print("Grade:", 14);
    c.print("11");
  }
}
