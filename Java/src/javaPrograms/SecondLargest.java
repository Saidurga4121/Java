package javaPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {40,30,20,50,10};
		
		int temp=0;    
		int i=0;
		int size=arr.length;
	    for(i=0;i<arr.length;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]>arr[j])  // 40>30        30>20  50> 10
	    		{
	    			temp=arr[i];     // temp=40; temp=30; temp=50
	    			arr[i]=arr[j]; // a[i]=30;  a[i]=20;   a[i]=10
	    			arr[j]=temp;  // a[j]=40;  a[j]=30;    a[j]=50;
	    		}
	    	}
	    	
	    }
            System.out.print(arr[size-1] + " ");    
        }    

	}


