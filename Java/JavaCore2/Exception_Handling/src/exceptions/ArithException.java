package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithException {

	public static void main(String[] args)throws IOException {
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Value 1: ");
		int number1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter Value 2: ");
		int number2 = Integer.parseInt(reader.readLine());		
		int result;
	
		try {
			result = (number1/number2);
			System.out.println("result: "+String.format("%.2i", result));	
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("An exception was caught: "+e.getMessage());
		}
	}

}
