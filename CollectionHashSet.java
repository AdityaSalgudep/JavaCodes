import java.util.*;
import java.io.*;



class CollectionHashSet
{
    public static void main(String args[]) 
    {
            HashSet<String> hs = new HashSet();

            hs.add("India---");
            hs.add("America---");
            hs.add("Pak---");
            hs.add("Canada---");

            Iterator it = hs.iterator();
            while(it.hasNext())
            {
                System.out.println("---"+it.next());
            }

    }
}