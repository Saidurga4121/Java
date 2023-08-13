package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int data=154321;
		int rev=0;
		while(data!=0)
		{
			int remainder =data%10;   // 5 
			rev=rev*10+remainder;   // rev+remainder(for suming of digits)
			data=data/10;		  
		}
		System.out.println(rev);
	}

}
