package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithCheckedExp {

	public static void main(String[] args)throws IOException{
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Value 1: ");
		int number1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter Value 2: ");
		int number2 = Integer.parseInt(reader.readLine());		
		int result;
	
		try {
			if(number2 ==0)
				throw new UnsupportedOperationException("/ by 0  not allowed");
			result = (number1/number2);
			System.out.println("result: "+result);	
		} catch (UnsupportedOperationException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("An exception was caught: "+e.getMessage());
		}
		
	}

}
