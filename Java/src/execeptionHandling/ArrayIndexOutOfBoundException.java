package execeptionHandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int a[]= new int[2];
		String name="sai";
		try
		{
			a[0]=10;
			a[1]=12;
			a[2]=13; // ArrayIndexOutOfBound Exception
		}
		// e.printStackTrace();---gives the description of the error
		// e.toString();----------gives only type of exception and the message of the same
		// e.getMessage;----------gives the message of the same.
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name);
		
		// the advantage of exception is if we don't write the try and catch block then the next
		// line of codes wont be executed .but if we write the try and catch then even if it is failing the
		// next lines will get executed.
}
}
