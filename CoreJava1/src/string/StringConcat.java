package string;

public class StringConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "java";
		Long starttime =System.currentTimeMillis();
		 for(int i = 0; i <= 10000; i++)
	        {
	            s = s + "J2EE";
	        }
		 long endTime = System.currentTimeMillis();
	        
	        System.out.println("Time taken by String class : "+(endTime - starttime)+" ms");
		

	}

}
