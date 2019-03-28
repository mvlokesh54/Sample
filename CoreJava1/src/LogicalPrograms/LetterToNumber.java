package LogicalPrograms;

import java.util.Iterator;
import java.util.Map;


import java.util.Scanner;


public class LetterToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter Key is " + phoneNumber);
		//String phoneNumber = "666-HAHA";
		//String phoneNumberAlpha="656-HAHA";
		java.util.Map<String, String> aMap = new java.util.HashMap<String, String>();
		
		aMap.put("abc", "2");
		aMap.put("def", "3");
		aMap.put("ghi", "4");
		aMap.put("jkl", "5");
		aMap.put("mno", "6");
		aMap.put("pqrs", "7");
		aMap.put("tuv", "8");
		aMap.put("wxyz", "9");
		
		phoneNumber = phoneNumber.toLowerCase();
		
	for(Map.Entry	m:aMap.entrySet())
	{
		System.out.println(" key--- "+m.getKey()+"values--- "+m.getValue());
	}
		
		
		
		java.util.Iterator keys = aMap.keySet().iterator();
		while (keys.hasNext()){
		    String regex = (String) keys.next();
		    
		    
		    System.out.println("regex"+regex);
		    String replacementValue = (String) aMap.get(regex);
		    phoneNumber = phoneNumber.replaceAll(regex, replacementValue);
		    //phoneNumber = phoneNumber.replaceAll(replacementValue, regex);
		   
		}
		
		System.out.println(phoneNumber);
		//System.out.println(phoneNumberAlpha);

	}

}
