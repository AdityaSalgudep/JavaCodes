import java.io.*;

class Base
{
    Base()
    {

    }

    static void fun()
    {
        System.out .println("Inside Base Fun");
    }

    void Run()
    {
        System.out.println("Inside Base Run");
    }
}

class Derived extends Base
{
    Derived()
    {

    }

    static void fun()
    {
        System.out.println("Inside Derived Fun");
    }

    void gun()
    {
        System.out.println("Inside Derived Gun");
    }

}

class Polymorphism
{
    public static void main(String args[])
    {
        Base bobj = new Base();
        bobj.fun();
        Derived dobj = new Derived();
        dobj.fun();
        Base bobj1 = new Derived();
        bobj1.fun();
        //dobj.gun();
        //bobj1.Run();
    }
}