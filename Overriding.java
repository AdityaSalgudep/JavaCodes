import java.io.*;

class Commercial
{
    static String name;

    static void SetName(String name1)
    {
        name=name1;
    }

    static String GetName()
    {
        return name;
    }

    static void CalculateBill(int unit)
    {
        int total=unit*5;
        System.out.println("Name is:"+GetName());
        System.out.println("Total Bill is for Commercial:"+total);
    }
}

class Domestic extends Commercial
{

    static void CalculateBill(int unit)
    {
        System.out.println("Name is:"+GetName());
        System.out.println("Total Bill is for Domestic:"+unit*3);
        
    }


}


class Overriding
{
    public static void main(String args[])
    {
    Commercial cobj = new Commercial();
    cobj.SetName("Aditya");
    cobj.CalculateBill(100);
    Domestic dobj = new Domestic();
    dobj.SetName("Priyanka");
    dobj.CalculateBill(50);

    Commercial c = new Domestic();  
    c.SetName("Priyanka"); 
    c.CalculateBill(50);   // 250=50*5;    due to static Keyword
                           // bcoz reference type method is evaluted 
    //Domestic d = new Commercial();      Down Casting Not allow


    }

}