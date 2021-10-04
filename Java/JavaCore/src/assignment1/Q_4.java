package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please provide subject1 marks");
		int subject1 = Integer.parseInt(reader.readLine());
		System.out.print("Please provide subject2 marks");
		int subject2 = Integer.parseInt(reader.readLine());
		System.out.print("Please provide subject3 marks");
		int subject3 = Integer.parseInt(reader.readLine());
		if(subject1>=60 && subject2>=60 && subject3>=60)
			System.out.println("Passed");
		else if(subject1>60 && subject2>60)
			System.out.println("Promoted");
		else if(subject2>60 && subject3>60)
			System.out.println("Promoted");
		else if(subject1>60 && subject3>60)
			System.out.println("Promoted");
		else if(subject1<60 && subject2<60 && subject3<60 || (subject1>=60 || subject2>=60 || subject3>=60))
			System.out.println("Failed");
	}

}
