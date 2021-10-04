package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validation {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int attempts =1;
		while(attempts<=3) {
			if(attempts>1)
				System.out.println("attempt "+attempts);
			
			System.out.print("Please provide Username: ");
			String login = reader.readLine();
			
			System.out.print("Please provide password: ");
			String password = reader.readLine();
			
			if(login.equalsIgnoreCase("User")) {
				if(password.equalsIgnoreCase("Password")){
					System.out.print("Welcome "+login);
					break;
				}
			}
			attempts++;
			if(attempts>3)
				System.out.print("Contact Admin");
		}
		
	}

}
