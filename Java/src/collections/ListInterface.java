package collections;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterface
{
    public static List<Object> main(String[] args)
    {
    	List<Object> city= new ArrayList<Object>();
    	// List<Object> city= new LinkedList<Object>();
    	city.add(1);
    	city.add("sai");
    	city.add("karthi");
    	city.add("durga");

    	for(int i=0;i<city.size();i++)
    	{
    		Object result=city.get(i);
    		System.out.println(result);
    	}
//    	System.out.println("********************************");
//    	city.add("karthi");
//    	// it wont get replaced instead the current element will moved to next one
//    	city.add(0,"kovvuri");
//    	// remove
//    	city.remove(1);
//    	// sorting  (by default it wil give ascending order)
//    	Collections.sort(city);
//    	Iterator<String> data=city.iterator();
//    	while(data.hasNext()) {
//    		System.out.println(data.next());
//    	}
//    	System.out.println("********************************");
		return city;
    	
    	
    	
    	
    	
    	
    }

}

