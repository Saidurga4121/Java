package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=43;
		
		int count = 0;
		
		   for(int i=2 ; i < num/2 ; i++) 
		   {
		      if(num%i == 0) {
		         System.out.println(num+" "+ " is not prime");
		         count ++;
		         break;
		      }
		   }
		   if(count==1) {
			   System.out.println(num+" "+ " is prime");
		   }

	}

}
