package hierarchy_Q_2_4;

public class Labourer extends Employee {
	private String name;
	private int salary;
	private int overTime;
	private int salaryRecieved;
	
	public Labourer() {}

	public Labourer(String name, int salary) {
		this.name = name;
		this.salary = salary;
		this.overTime = 0;
		this.salaryRecieved = 0;
	}
	
	@Override
	public void totalSalary() {
		System.out.println("total salary recieved: "+getSalaryRecieved());
	}

	@Override
	public void setSalaryRecieved(int amount) {
		this.salaryRecieved += amount;
	}
	
	public String getName() {
		return name;
	}

	public int getOverTime() {
		return overTime;
	}

	public int getSalary() {
		return salary;
	}

	public int getSalaryRecieved() {
		return salaryRecieved;
	}

	@Override
	public void setBonus(int extraTime) {
		this.overTime += extraTime;
		setSalaryRecieved(getOverTime());
	}

	@Override
	public String toString() {
		return String.format("Labourer [name=%s, salary=%s, overTime=%s, salaryRecieved=%s]", name, salary, overTime,
				salaryRecieved);
	}
	
}
