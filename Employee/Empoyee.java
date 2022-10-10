package com.prowing.Treeset.Employee;

import java.util.Comparator;


public class Empoyee {
	int   EmpId;
	String EmpName;
	String EmpCity;
	

	public Employee(int  id, String name, String city) {
		super();
		this.EmpId = id;
		this.EmpName = name;
		this.EmpCity = city;
	}





	@Override
	public String toString() {
		return "Employee [id=" + EmpId + ", name=" + EmpName + ", city=" + EmpCity + "]";
	}


}
class EmpId implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {		
		if (o1.EmpId ==o2.EmpId)
			return 0;
		else if (o1.EmpId >o2.EmpId)
			return 1;
		else
			return -1;
	}
}
class EmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.EmpName.compareTo(o2.EmpName);
	}
}
class EmpCity implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.EmpCity.compareTo(o2.EmpCity);
	}
}


	


}
