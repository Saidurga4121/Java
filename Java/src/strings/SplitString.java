package strings;

public class SplitString {

	public static void main(String[] args) 
	{
		String cities = "Hyderabad,Pune,Chennai,Gujarath,Bangalore,Nodia";
		for(int i =0; i<cities.length(); i++)
        {
			 int index=cities.indexOf(",");
			 System.out.println(index + " iam the index");
	         String str = cities.substring(0,cities.indexOf(","));
	         System.out.println("The cities are :: "+str);
	         cities = cities.substring(cities.indexOf(",") + 1);
        }

    }	
		
}


