package LogicalPrograms;

public class PrimeNumber {

	/**
	 * @param args
	 * @return 
	 */
	static void primnum()
	{
		for(int n=2;n<=100;n++)
		{
			int flag =0;
		for(int i=2;i<=n/2;i++)
		{
			if(n==0||n==1)
			{
				//System.out.println("Not prim number"+n);
				break;
			}
			
			if(n%i==0)
			{
				//System.out.println(n+" is not prime number");
				flag= 1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("prime number is:"+n);
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			primnum();
		
		
	}

}
