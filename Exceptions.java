import java.io.*;
import java.lang.*;

class Exceptions extends Exception
{
    Exceptions(String str)
    {
        super(str);
    }

    public static void main(String args[])
    {
      try{
                int no = Integer.parseInt(args[0]);
                int no1 = Integer.parseInt(args[1]);
                if(no<no1)
                throw new Exceptions("Error Occured ");
                System.out.println("Division is : ");
      }
      catch(Exceptions e)
      {
          
      }
    }
}