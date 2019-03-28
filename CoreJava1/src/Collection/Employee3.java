package Collection;









public class Employee3 implements Comparable<Employee3>{

	int eid;
	String ename;
	public Employee3(int eid,String ename) {
		// TODO Auto-generated constructor stub
		
		this.eid=eid;
		this.ename= ename;
		
	}
	
	

	@Override
	public int compareTo(Employee3 e) {
		// TODO Auto-generated method stub
		
		if(eid==e.eid)
		return 0;
		else if(eid>e.eid)
			return 1;
		else 
			return -1;
		
	}
public String toString()
{
	return eid+""+ename;
}



	


	
	
	

}
