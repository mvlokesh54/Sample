package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "lokesh is bad boy";
		
		 String[] strarray= str.split(" ");
		 System.out.println(strarray);
		 
	System.out.println(Arrays.toString(strarray));

	}

}
