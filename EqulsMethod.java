import java.io.*;


class Any
{
    int i;
    Any(int j)
    {
            i=j;
    }
}
class EqulsMethod
{
    public static void main(String ar[])
    {
        Any a,b;
         a = new Any(10);
         b = new Any(10);
         b=a;

         Integer i = new Integer(10);
         Integer j = new Integer(10);

        if(a.equals(b))
        System.out.println("Same a & b");
        else
        System.out.println("Not Same a & b");

        if(i.equals(j))
        System.out.println("Same i & j");
        else
        System.out.println("Not Same i & j");

    }
}