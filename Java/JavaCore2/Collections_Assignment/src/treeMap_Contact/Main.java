package treeMap_Contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Long, Contact> contactMap = new TreeMap<>();
		int option;
		
		loop: do {
			System.out.println("choose options: 1. Enter values 2.Exit ");
			option = Integer.parseInt(reader.readLine());
			
			if(option ==2)
				break loop;
			
			System.out.println("Enter (long)phoneNumber:  ");
			long phoneNumber = Long.parseLong(reader.readLine());
			
			System.out.println("Enter name:  ");
			String name = reader.readLine();
			
			System.out.println("Enter email:  ");
			String email = reader.readLine();
			
			System.out.println("Enter gender: M | F ");
			String gender = reader.readLine();
			
			contactMap.put(phoneNumber, new Contact(phoneNumber, name, email, gender));
			
			for(Long p: contactMap.keySet()) {
				System.out.print(p);
				System.out.println(" --> "+contactMap.get(p));
				System.out.println("--------------------------------------------");
			}
			
		}while(option != 2);	
		
		System.out.print("Execution Done");
	}

}
