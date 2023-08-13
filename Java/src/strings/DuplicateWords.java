package strings;

public class DuplicateWords {

	public static void main(String[] args) {
		String data="Window is open. Is the Window open?";
		//
		
			String arr[]=data.split(" ");
			System.out.println(arr.length);
			int count;
			for(int i=0;i<arr.length;i++)
			{
				count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i].equals(arr[j]))
					{
						count=count+1;
						arr[j]="0";
					}
				}
				if(count>1 && arr[i]!="0")
				{
					System.out.println(arr[i]+"   -   "+count+ "times");
				}
			}
			
		}
	}


