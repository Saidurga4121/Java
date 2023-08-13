package collections;

import java.util.*;

public class SetInterface
{
     public static void main(String[] args)
     {
    	 Set<String> data= new LinkedHashSet<String>();
    	 data.add("sai");
    	 data.add("sai");
    	 data.add("durga");
    	 data.add("durga");
    	 data.add("444");
    	 Iterator<String> result=data.iterator();
    	 while(result.hasNext())
    	 {
    		 System.out.println(result.next());
    	 }
    	 System.out.println("**********************************");
//    	 data.add("1111");
//    	 // removing
//    	 data.remove("222");
//    	 result=data.iterator();
//    	 while(result.hasNext())
//    	 {
//    		 System.out.println(result.next());
//    	 }
//    	 

    	 
    	 
    	 
     }

}