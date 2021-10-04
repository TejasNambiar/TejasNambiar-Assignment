package hierarchy_Q_2_4;

import java.io.IOException;

public class Hierarchy {

	public static void main(String[] args)throws IOException {
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Employee manager = new Manager();
		Employee labourer = new Labourer();
		
		//Employee employee = new Employee();
		
		manager= new Manager("harry",200000);
		labourer = new Labourer("sadu", 10000);

		System.out.println("Manager details: "+manager);
		System.out.println("Labourer details: "+labourer);

		System.out.println("=====================================================================");
		manager.setSalaryRecieved(manager.getSalary());
		labourer.setSalaryRecieved(labourer.getSalary());

		System.out.println("Manager details: "+manager);
		System.out.println("Labourer details: "+labourer);
		
		System.out.println("=====================================================================");
		manager.setBonus(5000);
		labourer.setBonus(5000);
		
		System.out.println("Manager details: "+manager);
		System.out.println("Labourer details: "+labourer);
		
	}

}
