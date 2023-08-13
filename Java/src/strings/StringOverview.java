package strings;

public class StringOverview {
	static String word ="parallel java java";
    static int count=1;
	public static void main(String[] args) {
		/*
		 * replace()------replaces the given the string
		 * substring()----substring(2)-including 2 it will give till the end of the string
		 * indexOf()------returns a integer where the the character is present
		 * split()--------splits at 
		 * length()-------gives the length of the string
		 * charAt()-------gives the index where that character is present.
		 * equalsIgnore---ignore lower and upper , will compare two strings
		 * concat---------adds the two strings
		 * startsWith-----starts
		 * endsWith
		 * Contains
		 * toUpperCase
		 * toLowerCase
		 */	   
	        int len = word.length();
	        System.out.println(len);
	       
	        for(int i=0;i<len;i++) // Main loop for getting the characters one after the other from 0th index
	        {
	            for(int j=i+1;j<len;j++)// loop for getting the characters from i+1 index characters
	            {
	            //Get the 0th index character
	                 if( word.charAt(i)==word.charAt(j))
	                         count++;
	            }
	                 
	                 
	             if(count>1)
	                 System.out.println(word.charAt(i) + " is repeated "+count+" times");
	             
	             count =1;
	                     
	        }
	    }
	}


