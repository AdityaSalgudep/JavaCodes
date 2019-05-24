import java.io.*;

class RunThread extends Thread
{
    String str;
    RunThread(String str)
    {
            this.str=str;
    }    
    int s=0;
    public void run()
    {
            for(int i=0;i<5;i++)
            {
                System.out.println(str+"and i="+i);
            }
            for(int j=5;j>0;j--)
            {
                System.out.println(str+"and j="+j);
            }
                try
                {
                    Thread.sleep(2000);
                }catch(InterruptedException e){}
            
    }


}

class Threading1 
{
    public static void main(String args[]) throws IOException
    {
        RunThread r1 = new RunThread("Hii-");
        RunThread r2 = new RunThread("Heyy-");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}