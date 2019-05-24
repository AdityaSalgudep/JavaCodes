import java.io.*;

class RunThread extends Thread
{
    
    int s=0;
    public void run()
    {
        for(int i=1;i<1000000;i++)
        {
            System.out.println("Now-"+i);
            if(s==1)
            return;
        }
    }
}

class Threading 
{
    public static void main(String args[]) throws IOException
    {
        RunThread r1 = new RunThread();

        Thread t1 = new Thread(r1);

        t1.start();
        int n=(System.in.read());
        System.out.println(n);
        r1.s=1;
    }
}