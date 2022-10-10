package com.prowing.Treeset.Employee;
import java.util.TreeSet;


public class EmpoyeeTest {
public static void main(String[] args) {
		
		Employee e=new Employee(18,"Sham","Pune");
		Employee e1=new Employee(10,"Ram","Kolhapur");
		Employee e2=new Employee(15,"Vaibhav","Satara");
		
		
		
		TreeSet  ts1=new TreeSet (new EmpId());
		ts1.add(e);
		ts1.add(e1);
		ts1.add(e2);
		System.out.println("Sorting by Employee Name: "+ts1);
		
		
		TreeSet  ts2=new TreeSet (new EmpName());
		ts2.add(e);
		ts2.add(e1);
		ts2.add(e2);
		System.out.println("Sorting by Employee Name: "+ts2);
		
		TreeSet  ts3=new TreeSet (new EmpCity());
		ts3.add(e);
		ts3.add(e1);
		ts3.add(e2);
		System.out.println("Sorting by Employee Name: "+ts3);
		
		
	}


		

}

}
