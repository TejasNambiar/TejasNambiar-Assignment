package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class incomeTax {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please provide CTC");
		int ctc = Integer.parseInt(reader.readLine());
		if(ctc<=180000)
			System.out.println("CTC: "+ctc+" tax amount: "+0);
		else if(ctc>181000 && ctc <=300000){
			double tax = ctc * 0.1;
			System.out.println("CTC: "+ctc+" tax amount: "+tax);
		}
		else if(ctc>300001 && ctc <=500000){
			double tax = ctc * 0.2;
			System.out.println("CTC: "+ctc+" tax amount: "+tax);
		}
		else if(ctc>500001 && ctc <=1000000){
			double tax = ctc * 0.3;
			System.out.println("CTC: "+ctc+" tax amount: "+tax);
		}
		
	}

}
