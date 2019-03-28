package LogicalPrograms.Done;

import java.util.ArrayList;

public class FebDemo {
	
	
	
	public static void main(String[] args) {
		
	
		for(int n=2;n<100;n++)
		{
			int flag=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n==0||n==1)
				{
					System.out.println(n+" is not a prime number");
				}
				if(n%i==0)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(n+"is prime number");
			}
		}
		
	}

}
