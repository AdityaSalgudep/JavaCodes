import java.io.*;

class Counting
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = new FileInputStream("MyFile.txt");
        int c;
        int ccnt=0,wcnt=0,lcnt=0;
        System.out.println("File Contains:-");
        while((c=fis.read())!=-1)
        {
            System.out.print((char)c);
            char ch=(char)c;
            if(c != ' ' && c!='\n' && c!='\r')//Every Enter Is Count 2 due to \n & \r(Both)
            ccnt++;
            if(c=='\n')
            lcnt++;
            if(c==' ' || c=='\n')
            wcnt++;
        }
        System.out.println("File Contains Characters:-"+ccnt);
        System.out.println("File Contains Words:-"+wcnt);
        System.out.println("File Contains Lines:-"+lcnt);

    }
}