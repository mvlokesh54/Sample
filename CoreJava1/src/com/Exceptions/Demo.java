package com.Exceptions;
import java.io.IOException;
public class Demo {
	public int sum(int a, int b,int c)  throws IOException
	{
		try {
		if(a == 0)
		{
			
				c= b/a;
		}
		else
		{
			System.out.println("operation possible");
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return c;
		
	}
	
	public static void inst()
	{
		System.out.println("insanceated  ");
	}
	
	public static void main(String[] args) throws Exception {
		//ThrowException te = new ThrowException();
			int result;
				//result = Demo.sum(0,4,0);
				//System.out.println("result is"+result);
			
			/*try {
				te.mymethod(2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		System.out.println("hi ");
	}

}
