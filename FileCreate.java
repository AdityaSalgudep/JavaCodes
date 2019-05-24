import java.io.*;

class FileCreate
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream dos = new FileOutputStream("MyFile.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(dos);
         while((ch=(char)dis.read())!='@')
        bos.write(ch);
    
}
}