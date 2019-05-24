import java.io.*;

abstract class Base
{
  abstract  void fun();

    abstract void gun();

    void run()
    {
        System.out.println("Inside Base Run");

    }  



}

class Der1 extends Base
{
    void fun()
    {
        System.out.println("Inside Der1 fun");
    }

    void gun()
    {
        System.out.println("Inside Der1 gun()");
    }

void run()
{
     System.out.println("Inside Der1 run()");
}


    void mun()
    {
        System.out.println("Inside Der1 mun()");
    }
}



class AbstractClass
{
    public static void main(String ar[])
    {
        Base d ;
        d = new Der1();
        d.fun();
        d.gun();
        d.run();
        d.mun();
    }

}