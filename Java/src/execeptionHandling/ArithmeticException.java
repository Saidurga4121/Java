package execeptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			try 
			{
			    int a=10/i;
		        System.out.println(a);
		    }
			catch(Exception e)
			{
                System.out.println(e.getLocalizedMessage());
			}
		}
		
		System.out.println("exception written");

	}

}
