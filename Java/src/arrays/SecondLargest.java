package arrays;

public class SecondLargest {

	public static void main(String[] args) 
	{
		int a[]= {10,30,20,50,40,70};
		int largest=a[0];
		int secondLargest=a[0];
		
		//
		for(int i=0;i<a.length;i++)
		{
			if(largest<a[i]) // 0<10
			{
				secondLargest=largest; // sl=0
				largest=a[i];  // a[i]=0;
			}
			else if(secondLargest<a[i])  // 0<10
			{
				secondLargest=a[i];   // sl=10;
				
			}
			
		}
		System.out.println(secondLargest);
	}

}
