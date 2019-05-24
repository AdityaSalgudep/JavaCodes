import java.io.*;
import emp.*;

class ObjectFromFile
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = new FileInputStream("MyFile4");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee e;
        try{
        while((e=(Employee)ois.readObject())!=null)
        {
            e.Display();

        }
        }catch(ClassNotFoundException  | EOFException ex){}
    
    }
}