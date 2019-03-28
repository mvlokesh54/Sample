package string;

public class SwapStrings {

	/**
	 * @param args
	 */
	
	//Swap strings
	public void swapTwoStrings()
	{
		String a = "love";
		String b = "you";
		System.out.println("Before swap a value :" + a + " b value :" + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println("After swap a " + a + " b " + b);
	}
	//Swap numbers
	public void swapTwoNumber()
	{
		int a = 10;
		int b = 20;
		System.out.println("Before swap a value :" + a + " b value :" + b);
		a = a + b;// a=30 and b=20
		b = a - b;// a=30 and b=10
		a = a - b;
		System.out.println("After swap a " + a + "b " + b);
	}
	
	// Do String Reverse
	
	public static void StrReverse()
	{
		String x="lokesh";
		StringBuilder sb= new StringBuilder(x);
		x=sb.reverse().toString();
		System.out.println("After String Reverse X value :"+x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SwapStrings ss = new SwapStrings();
		ss.swapTwoNumber();

		ss.swapTwoStrings();
		SwapStrings.StrReverse();
		 
		 /*System.out.println("a string is :"+a);//a=loveyou
		 b=a.substring(4); 
		 System.out.println(b);// b=you
		 a=a.substring(0,4);
		 System.out.println("a value : "+a);*/
		 
		 //or
		 
		 
		
	}

}
