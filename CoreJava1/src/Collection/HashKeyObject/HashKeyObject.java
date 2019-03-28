package Collection.HashKeyObject;

import java.util.HashMap;
import java.util.Iterator;

public class HashKeyObject {
	
	public static void main(String[] args) {
		
		
		Employee emp1= new Employee(1, "lokesh");
		Employee emp2= new Employee(1,"lokesh");
		Employee emp3= new Employee(1,"lokesh");
		
		HashMap<Object, String> map= new HashMap<>();
		
		map.put(emp1, "user1");
		map.put(emp2, "user2");
		map.put(emp3, "user3");
		
		Iterator itr = map.keySet().iterator();
		
		while(itr.hasNext())
		{
			Employee em1 =(Employee)itr.next();
			System.out.println(em1);
			System.out.println(map.get(em1));
		}
		
		
		
	}

}
