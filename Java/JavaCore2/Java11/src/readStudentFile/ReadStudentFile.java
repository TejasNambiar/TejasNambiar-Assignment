package readStudentFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentFile {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\RAKESH JI\\GitAssignment\\Java\\JavaCore2\\Java11\\src\\readStudentFile\\StudentList.txt";
		FileReader fileReader = new FileReader(new File(path));
		BufferedReader reader = new BufferedReader(fileReader);

		String line;
		while ((line = reader.readLine()) != null) {
			if (!line.isEmpty())
				System.out.println(line);
		}

		reader.close();
	}

}
