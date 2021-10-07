package hashSetEmployee;

import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<>(); 
		employee.add(new Employee(1, "Emp1", 34000));
		employee.add(new Employee(2, "Emp2", 76000));
		employee.add(new Employee(3, "Emp3", 97000));
		employee.add(new Employee(4, "Emp4", 23000));
		employee.add(new Employee(5, "Emp6", 23000));
		employee.add(new Employee(3, "Emp7", 12000));
		employee.add(new Employee(3, "Emp6", 12001));
		System.out.println("total number of employee: "+employee.size());
		for(Employee p: employee)
		System.out.println(p);
		
	}

}
