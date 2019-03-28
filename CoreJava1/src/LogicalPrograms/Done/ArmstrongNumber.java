package LogicalPrograms.Done;

public class ArmstrongNumber {

	/**
	 * @param args
	 * 
	 * printing armstron numbers between 100 to 1000
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,a,b,n=100;
		
		for(int i=100;i<=1000;i++)
		{
			int c=0;
			temp=i;
			for( n=i;n>0;)
			{
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
			}
			if(temp==c)
			{
				System.out.println("Armstrong Numbers:"+c);
			}
			
			
		}
		
		
		
	}
	
	
	

}
