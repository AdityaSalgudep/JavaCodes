import java.io.*;

 class Train extends Thread
{
    int avl=1;
    int req;
    Train(int p)
    {
        req=p;
    }
    synchronized public void run()
    
    {
        //synchronized(this){   //here also we can use synchr. keyword (this) for current object
        if(avl>0)
        {
            String name=Thread.currentThread().getName();
            //avl-=req;//gives diff output no require synchr. keyword
            System.out.println("Now Seats Are Available:"+avl+"  and from them "+req+" seats are booked for "+name);
             avl-=req;//  gives diff output
            System.out.println("Now Seats Are Available after booking:"+avl);

        }
        //}

    }
}

class ThreadingOnSingleObject
{
    public static void main(String ar[]) 
    {
        Train obj1 = new Train(1);
       // Train obj2 = new Train(1);

        Thread t1 = new Thread(obj1,"Aditya");
        Thread t2 = new Thread(obj1,"Priyanka");

        t1.start();
        t2.start();

    }
}

