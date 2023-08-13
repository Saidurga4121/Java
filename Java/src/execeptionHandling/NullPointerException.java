package execeptionHandling;

import java.util.Scanner;

public class NullPointerException {
	
	
	
		int arr[] = null;  
		public static void main(String[] args) {  
		// TODO Auto-generated method stub  
			
		try {
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		}   
	
	
	
	
	
//	  static String Name=null;
//	    static int a[] = new int[2];
//	    public static void main(String[] args)
//	    {
//	        try
//	        {
//	         Name = Name.concat(" S");
//	         System.out.println("Name :: "+Name.length());
//	        }
//	        catch(Exception e)
//	          {
//	            System.out.println(e.getLocalizedMessage());
////	            if(e.getMessage()==null)
////	            {
////	                System.out.println("The Name string variable is having null value... Assign a valid string value.....");
////	                System.out.println("Enter the String Name variable value");
////	                Scanner s = new Scanner(System.in);
////	                Name = s.next();
////	                 Name = Name.concat(" S");
////	                 System.out.println("Name :: "+Name);
////	               
////	            }
//	        }
////	         finally
////	         {
////	             System.out.println(" Concated two string successfully");
////	         }
//////	         /*
//////	          index        0        1
//////	          a            0        0
//////	          */
//////	       
//////	         try
//////	         {
//////	             a [0]=10;
//////	             a[1]=20;
//////	             a[2]=30;//ArrayIndexOutOfBound
//////	             
//////	             /*
//////	              index        0        1        2
//////	              a            10        20        30
//////	              */
//////	       
//////	         }catch(Exception e)
//////	         {
//////	             e.printStackTrace();
//////	         }
//////	         System.out.println("************************");
//////	       
//////	         for(int i=0;i<=2;i++)
//////	         {   
//////	             try
//////	             {
//////	                 System.out.println(10/i); //Arithmetic
//////	             }catch(Exception e)
//////	             {
//////	                 System.out.println(e.getLocalizedMessage());
//////	             }
//////	         }
//////	         
//////	         System.out.println("************************");
//////	         
//////	         System.out.println("Execution ended");
////	    }


		
	    }


	