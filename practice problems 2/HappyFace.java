import hsa.Console;
import java.awt.*;

public class HappyFace
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    c.setColor(Color.yellow);
    c.fillOval(100, 100, 100, 100);
    c.setColor(Color.black);
    c.drawOval(100, 100, 100, 100);
    c.fillOval(115, 125, 25, 25);
    c.fillOval(160, 125, 25, 25);
    c.drawLine(115, 160, 135, 180);
    c.drawLine(135, 180, 165, 180);
    c.drawLine(165, 180, 185, 160);
    c.setCursor(12, 6);
    c.print("Hello Mr. Burns, how is computers class?");
  }
}