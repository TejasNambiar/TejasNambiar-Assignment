package removeIf;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("Brussels");
		list.add("Paris");
		list.add("Havana");
		list.add("Cairo");
		list.add("Miami");
		list.add("Tokyo");
		list.add("Manchester");
		
		list.removeIf(element -> element.length()%2 !=0);
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
}