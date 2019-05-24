import java.io.*;

/** This is ObjectRelation Demo to understand how object of one class is created and use
in another class */
class Hello
{
	Demo dobj;
	/** This is Hello Constructor */


	Hello(Demo dobj)
	{
		this.dobj=dobj;
		//dobj.display();
	}
	
	void display()
	{
		dobj.display();
		System.out.println("I m in Hello");
	}
}
class Demo
{
	int x;
	/** This is Demo Constructor */
	Demo(int x)
	{
		this.x=x;
	}
	
	void display()
	{
		System.out.println("Value of X="+x);
	}
}


public class ObjectRelation
{
	public static void main(String Ar[])
	{
		
		Demo dobj = new Demo(10);
		
		/** Here Object of Class Hello is Created and pass the object of class Demo*/
		Hello hobj = new Hello(dobj);
		hobj.display();
		
	}
	
}