package LogicalPrograms;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "madam", pal = "";
		
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			
			pal= pal+c;
			
			
		}
		System.out.println(pal);
		
		if(s.equals(pal))
		{
			System.out.println("this is palindrum");
		}
	}

}
