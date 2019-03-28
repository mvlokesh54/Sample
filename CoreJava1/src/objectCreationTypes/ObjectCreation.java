package objectCreationTypes;

public class ObjectCreation {
	
	public static void main(String[] args) {
		
		//Using New Instance (Reflection )Class.forName
		
		/*try {
			Class cls = Class.forName("objectCreationTypes.Bike1");
			
				Bike1 obj= (Bike1)cls.newInstance();
				Bike1 obj1= (Bike1)cls.newInstance();
				System.out.println("obj--"+obj);
				System.out.println("obj1--"+obj1);
		}
				
			 catch (InstantiationException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (IllegalAccessException e) {
			 e.printStackTrace();
			 }
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Using Clone :We can also use Clone() Method to create a copy of an existing Object.
		
		Bike1 obj= new Bike1();
		System.out.println("obj--"+obj);
		try {
			Bike1 obj1 = (Bike1)obj.clone();
			System.out.println("obj1--"+obj1);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*output:
		obj--objectCreationTypes.Bike1@47ffccd6
		obj1--objectCreationTypes.Bike1@6ae11a87
		created a copy of an existing Object
		*/
		
	}

}
