  package dateAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Date_Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<LocalDate> list = new LinkedList<>();
		list.add(LocalDate.of(2021, 10, 8));
		list.add(LocalDate.of(1998, 10, 21));
		list.add(LocalDate.of(1999, 10, 28));
		int option;
		System.out.println("Enter 1. proceed/t2. exit");
		option = Integer.parseInt(reader.readLine());
		
		 while (option != 2){
			try {	
				System.out.println("Enter 1. add date/t2. view date");
				int option1 = Integer.parseInt(reader.readLine()); 
				switch (option1) {
				case 1: 
					System.out.println("Enter Date format in DD-MM-YYYY");
					String date = reader.readLine();
					
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					LocalDate parsedDate = LocalDate.parse(date, formatter);
					System.out.println("date added: "+parsedDate);
					list.add(parsedDate);
					break;
				case 2:
					// taking any random value for simplicity
					System.out.println("Your date of birth is "+list.get(2)+" and it "+CheckLeapYear(list.get(2)));
					break;
				default:
					System.out.println("Enter valid input");
				}
							
				System.out.println("Enter 1. proceed/t2. exit");
				option = Integer.parseInt(reader.readLine());
			} catch (Exception e) {
				System.out.println("error: " + e.getMessage());
			} 
		};
	}

	private static String CheckLeapYear(LocalDate localDate) {
		if(localDate.getYear()%4 ==0)
			return "was leap year";
		return "wasn't leap year";
	}

}
