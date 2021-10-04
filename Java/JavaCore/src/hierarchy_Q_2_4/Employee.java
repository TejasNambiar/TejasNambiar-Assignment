package hierarchy_Q_2_4;

public abstract class Employee {
	private String name;
	private int salary;
	
	public Employee() {}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	public abstract void totalSalary();
	
	public abstract void setSalaryRecieved(int salary);
	
	public abstract void setBonus(int amount);
	
}
