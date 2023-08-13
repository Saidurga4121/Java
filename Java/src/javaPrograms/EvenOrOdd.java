package javaPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	
//	public static void main(String[] args) throws InterruptedException {
//////		int max=20;
//////		for(int i=0;i<=max;i++)
//////		{
//////			int result=i%2;
//////			if(result==0)
//////			{
//////				System.out.print(i+ " ");
//////			}
//////		}
////		Thread.sleep(4000);
////		int max=3;
////		int result=1;
////		for(int i=1;i<=max;i++)
////		{
////			result=result*i;
////		}
////		System.out.println(result);	
//		
//		
//		int n=10;
//		for(int i =2;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				
//			}
//		}
//	}
	
	
	   public static void main (String[] args)
	   {		
	      Scanner scanner = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers =  i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	   }
	}


