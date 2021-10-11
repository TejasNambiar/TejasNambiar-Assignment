package mapKV_lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MapsKV_lambda {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Carrot");
		map.put(4, "Dog");
		map.put(5, "Elephant");
		
		printList(map,System.out::println);
	}

	private static void printList(Map<Integer, String> map, Consumer<String> consumer) {
		StringBuilder buffer= new StringBuilder("");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			buffer.append("Key: "+entry.getKey()+" -> Value: "+entry.getValue()+"\n");			
		}
		consumer.accept(buffer.toString());
	}

}
