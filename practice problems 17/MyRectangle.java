public class MyRectangle 
{ 
  // Attributes 
  private double length; 
  private double width; 
  private String units; 
  
  // Constructor intializes length, width and units
  public MyRectangle(double l, double w, String mesurementUnit)
  {
    length = l; 
    width = w; 
    units = mesurementUnit; 
  }
  
  // Constructor sets length and width of the rectangle to 1 meter 
  public MyRectangle() 
  {
    length = 1; 
    width = 1; 
    units = "meter";
  } 
  
  // Caculates the area of the rectangle 
  public void areaOfRectangle(double l, double w, double area)
  {
    area = l*w; 
  }
  
  // Caculates the parameter of the rectangle 
  public void parameterOfRectangle(double l, double w, double parameter)
  { 
    parameter = (l*2) + (w*2); 
  }
  
  // Determines if the ractangle is a sqaure or not 
  public boolean sqaureOrNot(double l, double w)
  { 
    if(l == w)
    { 
      return true; 
    }
    else 
    {
      return false; 
    }
  }
  
  // Returns the length of the rectangle 
  public double getLength()
  {
    return length; 
  }
  
  // Returns the width of the rectangle 
  public double getWidth()
  {
    return width; 
  }
  
  // Returns units of the rectangle 
  public String getUnit()
  {
    return units; 
  }
}