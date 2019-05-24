import java.io.*;
abstract class Demo
{
   abstract void sun();
}

interface Base //    extends Demo     : not allow to extend  any class even abstract class 
{
    int a=10;
    void run();
    void mun();
    void fun();
}
interface Base1 extends Base
{
    int b=20;
    void gun();
    void fun();
    class Adi    // Allow to write class inside interface
    {
        void mmm()
        {
            System.out.println("Hii");
        }
    }
}

class Der implements Base,Base1
{
    public void gun()
    {
        System.out.println("Inside Der Gun a="+a);//a++ is not allow due to final(public static final)
    }

    public void fun()
    {
        System.out.println("Inside Der Fun a="+a);
    }
    public void mun()
    {
        System.out.println("Inside Der Mun b="+b);
    }
    public void run()
    {
        System.out.println("Inside Der Run");
    }
    
}

class Interface 
{
    public static void main(String args[])
    {
        Base1 b;
       
       
        b=new Der();

        b.gun();
        b.fun();
        b.run();
        b.mun();

        Base b1;

      //  b1.fun();        Not allow to call Base1 method 
     }
}