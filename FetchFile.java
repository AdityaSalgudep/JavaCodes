import java.io.*;

class FetchFile
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.println("Enter File name");

        String fname = br.readLine();
        FileInputStream fis=null;
        
        try{

         fis = new FileInputStream(fname);
         BufferedInputStream bis = new BufferedInputStream(fis);//use this to improvement of speed  
                                                            // O.W no need we can use only fis object
        System.out.println("File Contents are:");
       
        while((ch=bis.read())!=-1)
        System.out.print((char)ch);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not Found:");
        }
        fis.close();
    }
}