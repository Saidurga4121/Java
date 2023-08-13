package arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int a[]= {2,8,7};
		int count =0;
		for(int i=1;i<=10;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				if(i==a[j])
				{
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			count=0;
		}
		
		

	}

}
