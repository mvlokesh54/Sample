package constructor;
//Default constructor provides the default values to the object like 0, null etc. depending on the type
public class Student3 {
	
	int id;
	String Name;
	public void display()
	{
	System.out.println(id+"--"+Name);	
	}
	
	public static void main(String[] args) {
		
		Student3 s3= new Student3();
		Student3 s4= new Student3();
		s3.display();
		s4.display();
	}

}
/*output is 0--null
			0--null
			
			Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor.Here 0 and null values are provided by default constructor.
*/