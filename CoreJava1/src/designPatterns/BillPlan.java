package designPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BillPlan {
	
	public static void main(String[] args) throws IOException {
		
		PlanFactory pf= new PlanFactory();
		 System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName=br.readLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
		
		Plan p = pf.getPlanFactory(planName);
		
		System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
		
		p.getRate();
		p.getCalucalation(units);
	}

}
