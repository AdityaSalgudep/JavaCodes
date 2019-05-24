import java.io.*;

class Base
{
    private int x;
    
    Base(int i,int j)
    {

    }
    Base(int i)
    
    {
        System.out.println("Inside Base Constr."+x);


    }

    void Display()
    {
        System.out.println("Inside Base Display."+x);
    }
}


class Derived extends Base
{

    Derived(int i,int j)
    {
        super(i);
        ;
        //super(i,j);
        System.out.println("Inside Der. Constr."+super.x);


    }

    void Display()
    {
        super.Display();
        System.out.println("Inside Der. Display.");
    }


}

class Inheritance
{
    public static void main(String args[])
    {
            Derived dobj = new Derived(10,20);

            dobj.Display();

    }
}