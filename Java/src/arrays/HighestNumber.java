package arrays;

public class HighestNumber {

	public static void main(String[] args) {
		int a[]= {34,43,2,6,9,22,3};
		String[] name= {"sai","durga"};
		int smallest=a[0];
		int largest=a[0];		
		for(int i=1;i<a.length;i++) 
			{
				if(smallest>a[i]) // 34>2
				{
					smallest=a[i]; // small=2
				}
				if(largest<a[i])
				{
					largest=a[i];
				}
				System.out.println(name[i]);
				
			}

		System.out.println(smallest); 
		System.out.println(largest); 
		System.out.println();
		
		
		

	}

}
