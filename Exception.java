import java.io.*;



class Exceptions extends Exception
{
    public static void main(String args[])
    {
        try{
                int no = Integer.parseInt(args[0]);
                int no1 = Integer.parseInt(args[1]);
                System.out.println("Division is : "+(no/no1));
            }
            catch(Exception e)
            {}
    }
}