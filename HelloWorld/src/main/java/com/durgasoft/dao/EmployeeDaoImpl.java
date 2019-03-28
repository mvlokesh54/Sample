package com.durgasoft.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.durgasoft.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	String status = "";
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public String insertEmployee(Employee emp) {
		
		 Integer in= (Integer)hibernateTemplate.save(emp);
		 if(in==emp.getEno())
		 {
			 status="Success";
		 }
		 else {
			status="Failure";
		}
		 
		return status;
	}

	@Transactional
	public Employee searchEmployee(int eno) {

		 Employee emp = hibernateTemplate.get(Employee.class, eno);

		return emp;
	}

	@Transactional
	public String updateEmployee(Employee emp) {
		 hibernateTemplate.update(emp);
		 status= "Success";
		return status;
	}

	@Transactional
	public String deleteEmployee(int eno) {
		Employee emp= new Employee();
		emp.setEno(eno);
		hibernateTemplate.delete(emp);
		status= "Delete Success";
		return status;
	}

}
