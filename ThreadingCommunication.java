import java.io.*;
class Produce extends Thread
{
    int no;
    int arr[]= new int[20];
    Boolean compl=false;
    Produce(){}
    Produce(int n)
    {
        no=n;
        //arr[no];
    }
    public void run()
    {
        for(int i=0;i<no;i++)
        {
            arr[i]=i;
        }
        compl=true;
    }
} 
class Consume extends Thread
{
    Produce p ;
    int j=1;
    Consume(Produce pp)
    {
        p=pp;
    }
        public void run()
        {
            try{
                    while(!p.compl)
                    {
                        System.out.println("I M WAiting to Complete Producing:"+(j++)+"times");
                   
                    Thread.sleep(0);
                    }
                }
                catch(InterruptedException e)
                {}
                for(int i=0;i<p.no;i++)
                {
                    System.out.println("Now is:"+p.arr[i]);
                }
        }
}
class ThreadingCommunication
{
    public static void main(String args[])
    {
        Produce pp = new Produce(10);
        Consume cc = new Consume(pp);

        Thread t1 = new Thread(pp);
        Thread t2 = new Thread(cc);
        
        t1.start();
        t2.start();
    }
}