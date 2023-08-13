package strings;

public class Strings {
	   public static void main(String[] args)
	   {
		   String fname="sai";
		   String lname="karthi";
		   String find="parallel";
		   String path="saidurga.padala@gmail.com";
		   if(fname.equalsIgnoreCase(lname)) {
			   System.out.println("strings are same");
		   }
		   else
		   {
			   String combine=fname+" "+lname;
			   System.out.println("the concated string is"+" "+combine);
		   }
		   int length=path.length();
		   System.out.println("the length of the string is"+" "+length);
		   int num=path.indexOf("@");
		   System.out.println(num);
		   String substring=path.substring(num);
		   System.out.println("the substring of the string is"+" "+substring);
		   for(int i=0;i<=7;i++)
		   {
			   int count=0;
			   for(int j=i;j<=7;j++)
			   {
				   if(find.charAt(i)==find.charAt(j)) {
					   count++;
				   }
			   }
			   if(count>1)
			   {
				   System.out.println(find.charAt(i)+" is repeated "+count+" times");
			   }
		   }
		   
	   }
	
}
