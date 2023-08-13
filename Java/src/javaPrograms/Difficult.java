package javaPrograms;

// import java.util.Scanner;
public class Difficult 
{

	    
	    public static void main(String[] args)
	    {
	       
	       int space=0;
	       int star=4;
	       int z=1;
	       for(int i=1;i<=5;i++)
	       {
	    	   
	    	   for(int j=1;j<=star;j++)
	    	   {
	    		   
	    		   System.out.print(z+" ");
	    		   z++;
	    		   
	    	   }
	    	   for(int k=1;k<=space;k++)
	    	   {
	    		   System.out.print(" ");
	    	   }
	    	   System.out.println();
	    	   space++;
	    	   star--;
	    	   
	       }
        }
}

