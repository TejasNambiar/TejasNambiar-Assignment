package hashMap_KV;

import java.util.HashMap;
import java.util.Random;

public class Key_Value_Main {

	public static void main(String[] args) {
		HashMap<Integer, Double> randomHashMap = new HashMap<>();
		Random number = new Random();
		for(int i=0;i<10;i++) {
			// generates random integer and double 
			int randInt = 1 + number.nextInt(100);
			double randDouble = 1 + number.nextDouble();
			
			// putting the value in hash-map
			randomHashMap.put(randInt, randDouble);
		}
		
		// directly accessing for-each on hash-map
		// using lambda expression form to print values
		randomHashMap.forEach((k,v)->{
            System.out.format("key: %s, value: %,.2f%n", k, v);
		});
	}

}
