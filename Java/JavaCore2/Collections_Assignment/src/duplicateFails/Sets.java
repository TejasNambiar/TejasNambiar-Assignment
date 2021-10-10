package duplicateFails;

import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<String> nameSet = new TreeSet<>();
		System.out.println("trying to add 10 elements");
		nameSet.add("Abc");
		nameSet.add("DEF");
		nameSet.add("LMN");
		nameSet.add("PJOL");
		nameSet.add("ABC");
		nameSet.add("DEF");
		nameSet.add("LMN");;
		nameSet.add("PQL");
		nameSet.add("MVQ");
		nameSet.add("LMNO");	
		System.out.println("Size: "+ nameSet.size());
		System.out.println(nameSet);
	}

}
