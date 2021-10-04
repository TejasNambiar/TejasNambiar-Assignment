package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1_3 {

	static boolean isArmstrong(int n){ 
		
		int temp, digits=0, last=0, sum=0;
		temp=n;   
		while(temp>0){   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0){         
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));   
			temp = temp/10;   
		}    
		if(n==sum)    
			return true;      
		else
			return false;   
	}   
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please provide a numebr");
		int number = Integer.parseInt(reader.readLine());
		
		System.out.println("~~~Question 1~~~");
		System.out.println("number: "+number);
		System.out.println("Number provided is Armstrong? "+isArmstrong(number));
		System.out.println("\n~~~Question 2~~~");
		System.out.println("checking for numbers b/w 100-999: ");
		for(int i=100;i<1000;i++)
			if(isArmstrong(i))
				System.out.println("Number "+i+" is Armstrong");
		System.out.println("\n~~~Question 3~~~");
		System.out.println("Provide an amount to calculate: ");
		int amount = Integer.parseInt(reader.readLine());
		simpleInterest(amount);
		System.out.println("-------------------------------------------");
		compoundInterest(amount);
		
	}

	private static void compoundInterest(int amount) {
		
		double time = 2, rate = 10;
		double interest = (amount * time * rate) / 100;

	    System.out.println("Principal: " + amount);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Simple Interest: " + interest);
		
	}

	static void simpleInterest(int amount) {
		
		double time = 2, rate = 10, number = 3;
		double interest = amount * (Math.pow((1 + rate/100), (time * number))) - amount;

	    System.out.println("Principal: " + amount);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Number of Time interest Compounded: " + number);
	    System.out.println("Compound Interest: " + interest);
		
	}

}
