package genericExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static <T> void exchange(List<T> list, int pos1, int pos2) {
		//Using index value
		Collections.swap(list, pos1, pos2);
		System.out.println("List after change: "+list);
	}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		System.out.println("List before change: "+intList);
		int pos1 = 2, pos2 = intList.size()-1;
		exchange(intList, pos1, pos2);
		System.out.println("-------------------------------------------------");
		String [] a = {"Turtle", "Princess","Eugee","Mario"};
		List<String> list1 = new ArrayList<String>(Arrays.asList(a));
		System.out.println("List before change: "+list1);
		pos1 = 0; pos2 = list1.size()-1;
		exchange(list1, pos1, pos2);
	}

}
