package string2Array;

import java.util.Arrays;
import java.util.List;

public class String2Array {

	public static void main(String[] args) {
		var string = "A quick brown fox jumps over the lazy dog";

		List<String> stringList = Arrays.asList(string.split(" "));
		stringList.stream().forEach(System.out::println);

	}

}
