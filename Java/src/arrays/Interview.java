package arrays;

public class Interview {

	public static void main(String[] args) {
		int arr[]= {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3,2,2, 2, 2,  1, 1, 1, 1, 4, 4, 4, 4, 5, 5 ,5, 4, 4, 4};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j] )
				{
					System.out.print(arr[i]+" , ");
			    }
			}

	}

}
}
