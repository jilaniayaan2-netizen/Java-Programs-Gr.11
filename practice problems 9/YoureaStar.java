import hsa.Console;

public class YoureaStar
{
  static Console c;
 
  public static void main (String[] args) {
    c = new Console();
    
    String whichPattern; 
    c.print("Which pattern do you want? Enter A, B, C, D: "); 
    whichPattern = c.readString(); 
    
    if(whichPattern.equals("A"))
    { 
      for(int rows = 0; rows <= 5; ++rows)
      { 
        for(int i = 0; i <= 5; ++i)
        { 
          c.print("*");
        }
        c.println();
      }
    }
    else if(whichPattern.equals("B"))
    { 
      for(int rows = 0; rows <= 5; ++rows)
      { 
        for(int i = 0; i <= rows; ++i)
        { 
          c.print("*");
        }
        c.println();
      }
    }
    else if(whichPattern.equals("C"))
    { 
      for(int rows = 5; rows >= 0; --rows)
      { 
        for(int i = 0; i <= rows; ++i)
        { 
          c.print("*");
        }
        c.println();
      }
    }
    else 
    { 
      for(int rows = 0; rows <= 4; ++rows)
      { 
        for(int i = rows; i >= 0; --i)
        {
          c.print("*");
        }
        c.println();
      }
      for(int rows = 3; rows >= 0; --rows)
      { 
        for(int i = 0; i <= rows; ++i)
        { 
          c.print("*");
        }
        c.println();
      }
    }
  }
}