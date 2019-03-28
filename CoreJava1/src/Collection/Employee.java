package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee {

	
	public static void main(String[] args) {
		
		/*TreeSet<Employee1> set = new TreeSet<>(new AgeComparator());
		
		set.add(new Employee1(1,"Lokesh"));
		set.add(new Employee1(3,"Ramana"));
		set.add(new Employee1(2,"Raj"));*/
		
		ArrayList<Employee1> ar= new ArrayList<Employee1>();
		ar.add(new Employee1(1,"Lokesh"));
		ar.add(new Employee1(3,"Ramana"));
		ar.add(new Employee1(2,"Raj"));
		
		System.out.println("Sorting by Name...");  
		Collections.sort(ar,new NameComparator());
		
		System.out.println(ar);
		
		Iterator it=ar.iterator();
		
		while(it.hasNext()){
			Employee1 e=(Employee1)it.next();
			System.out.println(e);
			
		}
		/*for(Employee1 e:set){
			System.out.println(e);
		}*/
			
		System.out.println("Sorting by Age...");  
		Collections.sort(ar,new AgeComparator());
		 it=ar.iterator();
		
		while(it.hasNext()){
			Employee1 e=(Employee1)it.next();
			System.out.println(e);
			
		}
		/*for(Employee1 e:set1){
			System.out.println(e);
		}*/

	}
}
	class AgeComparator implements Comparator<Employee1>{

		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			if(e1.age==e2.age)
			return 0;
			else if(e1.age>e2.age)
				return 1;
			else
				return -1;
		}

}
	class NameComparator implements Comparator<Employee1>{

		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			
			return e1.name.compareTo(e2.name);
		}
		
	}
class Employee1{
	
	int age;
	String name;
	
	Employee1(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	
	public String toString(){
		return name+" "+age;
	}
}
