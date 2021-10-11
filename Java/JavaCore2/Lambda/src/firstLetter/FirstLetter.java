package firstLetter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetter {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Mayfair");
		list.add("Amsterdam");
		list.add("Rome");
		list.add("Vienna");
		list.add("Edinburgh");
		list.add("London");
		
		printString(list,System.out::println);
		
		
		

	}

	private static void printString(List<String> list, Consumer<String> consumer) {
		StringBuilder buffer = new StringBuilder("");
		for (String string2 : list) {
			buffer.append(string2.charAt(0));
		}
		consumer.accept(buffer.toString().toUpperCase());
	}

}
