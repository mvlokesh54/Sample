package string;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class StrAllMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="lokesh";
		String b="Deva Raju";
		String c="lokesh";
		String d = new String("lokesh");
		
		System.out.println("String Equals : "+(a.equals(d)));//false
		System.out.println("String   == "+(a==d));
		System.out.println("String compareTo : "+(c.compareTo(a)));
		System.out.println("Length :"+(b.length()));
		System.out.println("CharAt :"+(a.charAt(2)));;
		System.out.println("SubSring with 1 parameter : "+(a.substring(3)));;
		System.out.println("SubSring with 2 parameter : "+(b.substring(1, 3)));
		/* 
		 * 1) sub string start with 0
		 * 2) End index is excluded
		 * */
		a.toUpperCase();
		a.toLowerCase();
		b.trim();//DevaRaju
		System.out.println(" Replace only : "+(b.replace("Deva Raju", "lokesh")));
		System.out.println("ReplaceALL  : "+(a.replaceAll("lok  ", "M")));
		a.concat(b);
		System.out.println("Concate"+a.concat(b));
		System.out.println("String concat + "+(8+8+a+b+8+8));
		
		//String Tokenizer
		
String		msg="lokesh is very bad boy";

StringTokenizer st= new StringTokenizer(msg," ");
while(st.hasMoreTokens())
{
	System.out.println("Tokenizer : "+st.nextToken());
}
	

String phno="abc";
HashMap hm = new HashMap();
hm.put("abc", "2");
hm.put("def", "3");
hm.put("ghi", "4");
hm.put("jkl", "5");
hm.put("mno", "6");
hm.put("pqrs","7");
hm.put("tuv", "8");
hm.put("wxyz","9");
String key = "";
 Iterator itr=hm.keySet().iterator();
 while(itr.hasNext())
 {
	key =(String)itr.next();
	String value= (String) hm.get(key);
	phno= phno.replaceAll(key, value);
 }
 System.out.println(phno);






	}
	
	
	

}
