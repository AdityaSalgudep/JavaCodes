import java.io.*;
import java.util.zip.*;
class UnZippingFile
{
    public static void main(String args[]) throws IOException
    {
 
        FileInputStream fis = new FileInputStream("MyFile2");
        FileOutputStream fos = new FileOutputStream("MyFile3");

        InflaterInputStream ifs = new InflaterInputStream(fis);
        int c;
        while((c=ifs.read())!=-1)
            fos.write(c);
    }
}