import java.util.Scanner;

public class Palindrome {
	
	



 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	int num = in.nextInt();


	//palindrome(num);

	int[] array = {2,4,1,5,3,6};


	//nearestNum(array);

	//fibnnociseries(num);

	Armstrong(num);
		}

		private static void Armstrong(int num) {

	String n=Integer.toString(num);
	int len=n.length();int temp = num;
	int r;int sum=0;
	System.out.println(len );
	while(num>0)
	{
		r=num%10;
		int multi =1;
		for(int i=1; i<=len;i++)
		{
			multi*=r;
				
		}
		//System.out.println(multi+":"+r );
		sum+=multi;
		System.out.println(sum+":"+num );
		num=num/10;
		
	}

	if(sum==temp)
	{
		System.out.print(temp +":"+ sum+"is a armstrong number");
	}
	else 
		System.out.print(temp +":"+sum+"is not armstrong number");
			
		}

		private static void fibnnociseries(int num) {
			int first =0;int second=1;
			System.out.print(first+","+second);
			int third=0;
			
			for(int i=2; i<=num;i++)
			{
				third = first+second;
				System.out.print(","+third);
				first = second;
				second=third;
			}
			
			
		}

		private static void nearestNum(int[] array) {
			int size = array.length;
			for(int i =0 ;i<=size -1;i++)
			{
				if(array[i]==array[size -1])
				{
					System.out.println("Nearest num" + array[i]+":"+ "-1");
				}
				for(int j=i+1; j<=size-1;j++)
				{
					if(array[j]>array[i])
					{
						System.out.println("Nearest num" + array[i]+":"+array[j]);
						break;
					}
				}
			}
		}

		private static void palindrome(int num) {
			int temp =num;int r;int sum =0;
			
			while(num>0)
			{
				r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
			
			if(temp==sum)
			{
				System.out.println(sum +"is a palindrome");
				
			}
			else
				System.out.println(sum +"is not a palindrome");
		}

	}



