package string;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character , Integer> hm = new HashMap<Character, Integer>();
		
		String str= "lokesh";
		String str1= "ramesh";
		String str2= new String("lokesh");
		String str3= "LOKESH";
		
		System.out.println("String equals :"+str.equals(str1));
		System.out.println("String equals :"+str.equals(str2));
		System.out.println("String equals :"+str.equals(str3));
		
		System.out.println("String == :"+(str == str1));
		System.out.println("String == :"+(str == str2));
		System.out.println("String == :"+(str == str3));
		
		System.out.println("ComareTo :"+(str.compareTo(str1)));
		System.out.println("ComareTo :"+(str.compareTo(str2)));
		System.out.println("ComareTo :"+(str.compareTo(str3)));
		
		System.out.println(" convert str1 to byte[] "+str1.getBytes());
		
		 System.out.println("convert byte[] to string "+Arrays.toString(str1.getBytes()));
		
		str = str.replaceAll("l", " ");
		
		System.out.println("char remove from string"+str);
		str =str.toUpperCase();
		System.out.println(str);
	}

}
