package constructor;

public class Student4 {
	
	int id;
	String Name;
	double sal;
	
	Student4(int i, String n) {
		
		id=i;
		Name=n;
	}
	
	/*Student4(int i, String n, double s)
	{
		id=i;
		Name=n;
		sal=s;
		Constructor overloading
	}*/
	
	/*	
	  There is no copy constructor in java. But, we can copy the values of one object to 
	  another like copy constructor in C++.
	  
	  Student4(Student4 s)
	{
		id=s.id;
		Name=s.Name;
	}*/
	
	void display()
	{
		System.out.println(id+"-"+Name+"- "+sal);
	}

	public static void main(String[] args) {
		
		Student4 s1= new Student4(54, "lokesh");
		Student4 s2= new Student4(55, "venkat");
		//Student4 s2= new Student4(s1); copy constructor
		//Student4 s2= new Student4(55, "venkat",120.0); Overloading
		
		s1.display();
		s2.display();
	}
	
}

/*	Output:
	54-lokesh
	55-venkat
	
	Use: Parameterized constructor is used to provide different values to the distinct objects

*/