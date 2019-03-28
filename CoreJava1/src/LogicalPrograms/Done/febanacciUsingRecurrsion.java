package LogicalPrograms.Done;

public class febanacciUsingRecurrsion {

	static int n1=0,n2=1,n3,num=10;
	
	static void febanacci(int num)
	{
		if(num>0)
		{
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			febanacci(num-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(n1+" "+n2);
		febanacci(num-2);
		
		
	}

}
