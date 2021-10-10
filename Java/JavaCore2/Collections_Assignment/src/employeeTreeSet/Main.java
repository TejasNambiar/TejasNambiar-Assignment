package employeeTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args)throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		TreeSet<Employee> employeeSet = new TreeSet<>();
		employeeSet.add(new Employee(6, "OPQ", "Dept6", 6000));
		employeeSet.add(new Employee(9, "XYZ", "Dept9", 9000));
		employeeSet.add(new Employee(7, "RST", "Dept7", 7000));
		employeeSet.add(new Employee(8, "UVW", "Dept8", 8000));
		employeeSet.add(new Employee(5, "LMN", "Dept5", 5000));
		employeeSet.add(new Employee(1, "ABC", "Dept1", 1000));
		employeeSet.add(new Employee(2, "DEF", "Dept2", 2000));
		employeeSet.add(new Employee(4, "JKL", "Dept4", 4000));
		employeeSet.add(new Employee(3, "GHI", "Dept3", 3000));
		employeeSet.add(new Employee(10, "ZAB", "Dept10", 10000));
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(14, "ZAF", "dept4", 114000));
		list.add(new Employee(11, "ZAC", "dept1", 111000));
		list.add(new Employee(13, "ZAE", "dept3", 113000));
		list.add(new Employee(12, "ZAD", "dept2", 112000));
		
		// using list to add new employees
		for(Employee e: list) {
			employeeSet.add(e);
		}
		
		String option;
		
		loop: do {
			System.out.println("Enter option: a. To enter data\tb. view data\tc. Exit");
			option = reader.readLine();
			if(option.equals("c"))
				break loop;
			switch (option) {
			case "a": 
				break;
			case "b": 
				for(Employee e: employeeSet) {
					System.out.println(e);
				}
				break;	
			default:
				System.out.println("Enter a valid value EITHER 'a' OR 'b' OR 'c' ONLY!");
			}
		}while(option !="c");
		
		System.out.println("Execution Done.");
	}

}
