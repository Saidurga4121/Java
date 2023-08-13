package collections;

import java.util.*;

public class MapInterface
{
     public static void main(String[] args)
     {
    	 Map<Integer,String> data= new LinkedHashMap<Integer,String>();
    	 data.put(1,"sai");
    	 data.put(2,"durga");
    	 data.put(3,"444");
    	 data.put(1, "tutorials");
    	 data.put(2, "point");
    	 data.put(3, "is best");

         System.out.println("Map value before change: "+ data);

         // put new values at key 3
         String prevvalue = (String)data.put(3,"is great");

         // check returned previous value
         System.out.println("Returned previous value: "+ prevvalue);

         System.out.println("Map value after change: "+ data);

    	 
    	 
    	 
     }

}