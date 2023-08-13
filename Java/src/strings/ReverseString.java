package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1="sai durga";
		String s2="";
		int len=s1.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);
		}	
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
	//////////////////////////////////////using reverse/////////////////////////
	

}

 