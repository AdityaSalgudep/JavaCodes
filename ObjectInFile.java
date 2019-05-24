import java.io.*;
import java.util.*;

class Employee implements Serializable
{
    int id;
    transient  String name;
    String addr;

    void Accept() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id of Employee:");
        id=Integer.parseInt(br.readLine());
        System.out.println("Enter Name of Employee:");
        name=(br.readLine());
        System.out.println("Enter Address of Employee:");
        addr=(br.readLine());
    }

    void Display()
    {
        System.out.println("Id of Employee:"+id);
        System.out.println("Name of Employee:"+name);
        System.out.println("Address of Employee:"+addr);
    }
}

class ObjectInFile
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream("MyFile4");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Enter how many Employee:");
        int no = Integer.parseInt(br.readLine());

        Employee e[]=new Employee[no];
        for(int i=0;i<no;i++)
        {
            e[i]=new Employee();
            System.out.println("For Employee "+(i+1));
            e[i].Accept();

            oos.writeObject(e[i]);
        }
        System.out.println("-------------Employee Details-----------:");
        for(int i=0;i<no;i++)
        {
            e[i].Display();
        }



    }
}