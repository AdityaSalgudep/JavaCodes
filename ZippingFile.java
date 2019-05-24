import java.io.*;
import java.util.zip.*;
class ZippingFile
{
    public static void main(String args[]) throws IOException
    {
        int ch;

        FileInputStream fis = new FileInputStream("MyFile.txt");
        FileOutputStream fos = new FileOutputStream("MyFile2");
        DeflaterOutputStream dfs = new DeflaterOutputStream(fos);

        
        int c;
        while((c=fis.read())!=-1)
            dfs.write(c);
    }
}  