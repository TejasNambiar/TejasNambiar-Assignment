package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Students_Average {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double[][] students= new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter subject "+j+" marks: ");
				double marks = Integer.parseInt(reader.readLine());
				students[i][j]=marks;
			}
			System.out.println("Student "+i+" info: "+Arrays.toString(students[i]));
			System.out.println("-----------------------");
		}
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<3;i++) {
			double total = students[i][0]+students[i][1]+students[i][2];
			System.out.println("Total Score of Student "+i+": "+total);
			System.out.println("Average Score of Student "+i+": "+(total/3));
			System.out.println("Average Score in subject "+1+": "+(students[i][0]/100));
			System.out.println("Average Score in subject "+2+": "+(students[i][1]/100));
			System.out.println("Average Score in subject "+3+": "+(students[i][2]/100));

			System.out.println("-----------------------");
			
			double total1 = students[0][i]+students[1][i]+students[2][i];
			System.out.println("Total Score of subject "+i+": "+total1);
			System.out.println("Average Score of subject "+i+": "+(total1/3));
			
			System.out.println("-----------------------------------------------------------");

		}
		
		
	}

}
