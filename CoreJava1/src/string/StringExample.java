package string;

import java.util.StringTokenizer;

public class StringExample {

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
		System.out.println("SubSring with 2 parameter : "+(a.substring(1, 3)));
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

		
		
		
	}

}
