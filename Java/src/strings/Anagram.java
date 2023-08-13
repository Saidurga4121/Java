package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1= "durga";
		String s2= "agru";
		
		// converts the string to char array.
		char[] s1char= s1.toCharArray();
		char[] s2char= s2.toCharArray();
		System.out.println(s1char+ " iam schar");
		//
		
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		
		if(Arrays.equals(s1char, s2char))
		{
			System.out.println("anagaram");
		}
		else
		{
			System.out.println("nothing");
		}

	}

	
	
}
