package employeeTreeSet;

public class Employee implements Comparable<Employee>{
	
	private int ID;
	private String name;
	private String department;
	private int salary;

	public Employee() {}
	
	public Employee(int iD, String name, String department, int salary) {
		ID = iD;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getID() - o.getID() ;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}
