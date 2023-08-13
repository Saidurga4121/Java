package javaPrograms;

public class Patterns {

	public static void main(String[] args) {
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("*************************");
		
		for(int i =4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("*********************************");
		for(int i =4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("*********************************");
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("*********************************");
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("*********************************");
		int space1=4;
		int star1=1;
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print("#");
			}
			System.out.println();
			space1--;
			star1+=2;
		}
		System.out.println("*********************************");
		int space2=0;
		int star2=9;
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star2;k++)
			{
				System.out.print("#");
			}
			System.out.println();
			space2++;
			star2-=2;
		}
		System.out.println("*********************************");
		int space3=3;
		int star3=1;
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=space3;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star3;k++)
			{
				System.out.print("#");
			}
			System.out.println();
			space3--;
			star3+=1;
		}
		System.out.println("*********************************");
		int space4=3;
		int star4=1;
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=space4;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star4;k++)
			{
				System.out.print("# ");
			}
			System.out.println();
			space4--;
			star4+=1;
		}
		System.out.println("*********************************");
		int space6=4;
		int star6=1;
		for(int i =1;i<=9;i++)
		{
			for(int j=1;j<=space6;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star6;k++)
			{
				System.out.print("#");
			}
			System.out.println();
			if(i<=4) { 
			space6-=1;
			star6+=2;
			}
			else {                
				space6+=1;
				star6-=2;
			}
		}
		System.out.println("*********************************");  
		int space7=3;
		int star7=1;
		for(int i =1;i<=7;i++)
		{
			for(int j=1;j<=space7;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star7;k++)
			{
				System.out.print("#");
			}
			System.out.println();
			if(i<=3) { 
			space7-=1;
			star7+=1;
			}
			else {                
				space7+=1;
				star7-=1;
			}
		}
		System.out.println("*********************************"); 
		int space8=3;
		int star8=1;
		for(int i =1;i<=7;i++)
		{
			for(int j=1;j<=star8;j++)
			{
				System.out.print("#");
			}
			for(int k=1;k<=space8;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			if(i<=3) { 
			space8-=1;
			star8+=1;
			}
			else {                
				space8+=1;
				star8-=1;
			}
		}
		System.out.println("*********************************"); 
		int space9=0;
		int star9=4;
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=space9;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star9;k++)
			{
				System.out.print("#");
			}
			System.out.println();
			space9+=1;
			star9-=1;
		}
		System.out.println("*********************************"); 
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j) {
				System.out.print("#");
			    }
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
	    }
//		// char ch='A';
//		for(int i=1;i<=3;i++)
//		{
//			for(int j=1;j<=3;j++)
//			{
//				System.out.print(ch+" ");
//			}
//			ch++;
//			System.out.println();
//		}
		System.out.println("*********************************"); 
		for(int i=1;i<=3;i++)
		{
			char ch='A';
			for(int j=1;j<=3;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		System.out.println("*********************************"); 
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		System.out.println("*********************************"); 
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==4)
				{
					System.out.print(k);
				}
				else 
				{
				System.out.print(k+""+"*"+" ");
			    }
				k++;
			 }
			System.out.println();
		}
		System.out.println("*********************************"); 
		int space10=4;
		int star10=1;
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=star10;j++)
			{
				if(j%2==0)
				{
				    System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			for(int s=1;s<=space10;s++)
			{
				System.out.print(" ");
			}
			System.out.println();
			space10-=1;
			star10+=1;
		}
		System.out.println("*********************************"); 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				else
				{
					if(j%2==0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
			}
			System.out.println();
		}
		System.out.println("*********************************");
		for(int i=5;i>=1;i--)
		{
			int k1=1;
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print(k1+" ");
					k1++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			int k1=1;
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print(k1+" ");
					k1++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("********************************");
		int k1=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(k1);
				}
			}
			k1++;
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			k1--;
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(k1);
				}
			}
			System.out.println();
		}
		System.out.println("********************************");
		for(int i=1;i<=8;i++)
		{
			for(int j=i;j>=1;j--)
			{
					System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("********************************");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==3)
				{
					if((i==1&&j==5)||(i==3&&j==5))
					{
						System.out.print((i+1)+" ");
					}
					else
					{
					System.out.print(i+" ");
					}
					
				}
				else
				{
					if((i==2&&j==1)||(i==4&&j==1))
					{
						System.out.print(i+" ");
					}
					else
					{
					System.out.print((i+1)+" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("********************************");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				int q=1;
				if(i==2&&j==2)
				{
					System.out.print(q+" ");
				}
				else if(i==3&&j==2)
				{
					System.out.print((q+1)+" ");
				}
				else
				{
					System.out.print("3"+" ");
				}
			}
			System.out.println();
		}
		System.out.println("********************************");
		for(int i=1;i<=6;i++)
		{
			char ch='A';
			for(int j=1;j<=6;j++)
			{
				if(i>=j)
				{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			char ch='A';
			for(int j=1;j<=6;j++)
			{
				if(i>=j)
				{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
		System.out.println("********************************");
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int alphabet=65;
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print((char)(alphabet+n-1)+" ");
					alphabet--;
					
				}
			}
			System.out.println();
		}
		System.out.println("********************************");
		int k2=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.print(k2+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			k2++;
			System.out.println();
		}
		System.out.println("********************************");
		for(int i=5;i>=1;i--)
		{
			int k3=1;
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.print(k3+" ");
					k3++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			int k3=1;
			for(int j=1;j<=5;j++)
			{
				if(i<j)
				{
					System.out.print(k3+" ");
					k3++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
}
}
