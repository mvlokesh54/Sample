package LogicalPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountChar {
	
	
	
	public static void main(String[] args) throws Exception  {
		
		
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a String: ");
		String  data = reader.readLine();
		System.out.println("Enter Character: ");
		char ch=(char)System.in.read();
		System.out.println(ch);
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			char c = data.charAt(i);
			System.out.println(c);
			if(c == ch)
			{
				count++;
				
			}
			
		}
		System.out.println("count is:"+count);
		
		
		
	}

}
