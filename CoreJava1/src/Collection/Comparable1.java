package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Comparable1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//TreeSet<Employee2> set = new TreeSet<>();
		ArrayList<Employee2> AR= new ArrayList<>();
		
		AR.add(new Employee2(33,"lokesh",4444));
		AR.add(new Employee2(22, "basker", 2354));
		AR.add(new Employee2(77, "vijay", 9876));
		
		Collections.sort(AR);
		
		for (Employee2 e:AR )
		{
			System.out.println(e);
		}
		
	}

}

class Employee2 implements Comparable<Employee2>
{
	int age;
	String name;
	int rollno; 
	public Employee2(int age,String name, int rollno) {

		this.age=age;
		this.name=name;
		this.rollno=rollno;
	}

	@Override
	public int compareTo(Employee2 o) {

			if(age==o.age)
			return 0;
			else if (age<o.age) 
			return 1;
			else
				return -1;
		
	}
	
	public String toString()
	{
		return age+""+name+""+rollno;
	}

}

	
	
	
	
	
	
	
