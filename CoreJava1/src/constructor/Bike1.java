package constructor;

public class Bike1 {
	
	Bike1()
	{
		System.out.println("bike is created");
	}

	public static void main(String[] args) {
		Bike1 b1= new Bike1();
		
	}
}
//Rule: If there is no constructor in a class, compiler automatically creates a default constructor.