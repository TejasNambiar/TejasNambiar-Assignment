package hierarchy_Q_2_4;

class Manager extends Employee{
	
	private String name;
	private int salary;
	private int incentive;
	private int salaryRecieved;
	
	public Manager() {}

	public Manager(String name, int salary) {
		this.name = name;
		this.salary = salary;
		this.incentive = 0;
		this.salaryRecieved = 0;
	}
	
	@Override
	public void totalSalary() {
		System.out.println("total salary recieved: "+getSalaryRecieved());
	}

	public String getName() {
		return name;
	}

	public int getIncentive() {
		return incentive;
	}

	public int getSalary() {
		return salary;
	}

		
	public int getSalaryRecieved() {
		return salaryRecieved;
	}

	@Override
	public void setSalaryRecieved(int amount) {
		this.salaryRecieved += amount;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void setBonus(int incentive) {
		this.incentive = incentive;
		setSalaryRecieved(getIncentive());
	}

	@Override
	public String toString() {
		return String.format("Manager: [name=%s, salary=%s, incentive=%s, salaryRecieved=%s ]", name, salary, incentive,
				salaryRecieved);
	}

}
