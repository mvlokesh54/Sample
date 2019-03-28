package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable2 {
	
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(new Employee3(2, "lokesh"));
		al.add(new Employee3(5, "raj"));
		al.add(new Employee3(3, "vital"));
		
		Collections.sort(al);
		Iterator itr =al.iterator();
		Employee3	al1 = null;
		while(al.iterator().hasNext())
		{
			try {
					al1= (Employee3)itr.next();
					
					System.out.println(al1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
		
			
			
		}
		
		
	}

}
