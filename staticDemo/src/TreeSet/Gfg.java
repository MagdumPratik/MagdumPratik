package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Gfg {
	 public static void main(String[] args)
	    {
	        // TreeSet of user defined objects
	        // and using comparator also
	        // we will create TreeSet of employees
	        System.out.println(
	            "Sorting on the basis of name in Ascending order");
	 
	        // passed first comparator object for
	        // sorting in ascending order of name
	        TreeSet<Employee> gfg
	            = new TreeSet<>(new FirstComparator());
	 
	        gfg.add(new Employee(1, "ram", 24));
	        gfg.add(new Employee(2, "krishna", 23));
	        gfg.add(new Employee(3, "sita", 26));
	        gfg.add(new Employee(4, "lakshman", 25));
	 
	        // printing each employee object
	        for (Employee employee : gfg) {
	            System.out.println(employee);
	        }
	 
	        System.out.println(
	            "Sorting on the basis of name in Descending order");
	 
	        // Passed second comparator object for
	        // Sorting in descending order of name
	        TreeSet<Employee> gfg1 = new TreeSet<>(new SecondComparator());
	        TreeSet<Employee> gfg2;
			gfg2.add(new Employee(1, "ram", 24));
	        gfg2.add(new Employee(2, "krishna", 23));
	        gfg2.add(new Employee(3, "sita", 26));
	        gfg2.add(new Employee(4, "lakshman", 25));
	 
	        // printing each employee object
	        for (Employee employee : gfg2) {
	            System.out.println(employee);
	        }
	 
	        // ThirdComparator
	        System.out.println(
	            "Sorting on the basis of age in ascending order");
	 
	        TreeSet<Employee> gfg3
	            = new TreeSet<>(new ThirdComparator());
	 
	        gfg3.add(new Employee(1, "ram", 24));
	        gfg3.add(new Employee(2, "krishna", 23));
	        gfg3.add(new Employee(3, "sita", 26));
	        gfg3.add(new Employee(4, "lakshman", 25));
	 
	        // printing each employee object
	        for (Employee employee : gfg3) {
	            System.out.println(employee);
	        }
	    }
	}
	 
	// for sorting in ascending order
	class FirstComparator implements Comparator<Employee> {
	    @Override public int compare(Employee e1, Employee e2)
	    {
	        return ((String) e1.name).compareTo((String) e2.name);
	    }
	}
	 
	// for sorting in descending order
	// passed in reverse order e2 first than e1
	abstract class SecondComparator implements Comparator<Employee> {
	    @Override public int compare(Employee e1, Employee e2)
	    {
	        return -((String) e1.name).compareTo((String) e2.name);
	    }
	}
	 
	// Sorted on the basis of age
	class ThirdComparator implements Comparator<Employee> {
	    @Override public int compare(Employee e1, Employee e2)
	    {
	        if (e1.age > e2.age) {
	            return -1;
	        }
	        else if (e1.age < e2.age) {
	            return 1;
	        }
	        else {
	            return (e1.age).compareTo(e2.age);
	        }
	    }

}
