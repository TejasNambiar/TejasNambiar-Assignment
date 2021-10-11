package replaceAllLambda;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Brussels");
		list.add("Paris");
		list.add("Havana");
		list.add("Cairo");
		list.add("Miami");
		list.add("Tokyo");
		list.add("Manchester");
		
		list.replaceAll(element -> element.toUpperCase());
		
		for (String string : list) {
			System.out.println(string);
		}

	}

}
