package fruit_Questions1_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question1to3 {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();

		fruits.add(new Fruit("Mango", 70, 80, "Yellow"));
		fruits.add(new Fruit("Apple", 80, 120, "Red"));
		fruits.add(new Fruit("Banana", 90, 60, "Yellow"));
		fruits.add(new Fruit("Jack Fruit", 100, 100, "Green"));
		fruits.add(new Fruit("Grapes", 60, 40, "Violet"));

		reverseSort(fruits);
		sort(fruits);
		filterRedSortPrice(fruits);
	}

	public static void reverseSort(List<Fruit> fruits) {
		// returns a stream Array with a sorted collection in Array list format
		List<Fruit> fruitName = fruits.stream().filter(p -> p.getCalories() < 100)
				.sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
				.collect(Collectors.toCollection(ArrayList::new));

		List<String> fruitName1 = new ArrayList<>();
		for (Fruit fruit : fruitName) {
			fruitName1.add(fruit.getName());
		}

		for (String fruit : fruitName1)
			System.out.println(fruit);

		System.out.println("-------------------------------------------------------------------------------");
	}

	public static void sort(List<Fruit> Fruits) {

		/**
		 * Sorting Fruits
		 * 
		 * @.toCollection - returns a stream Array with a sorted collection in Array
		 *                list format
		 */
		Fruits = Fruits.stream().sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toCollection(ArrayList::new));
		for (Fruit fruit : Fruits) {
			System.out.println(fruit);
		}
		System.out.println("-------------------------------------------------------------------------------");
	}

	public static void filterRedSortPrice(List<Fruit> fruits) {
		fruits = fruits.stream()
				// filter objects with color red
				.filter(p -> p.getColor().equals("Red"))
				// compare them on price
				.sorted(Comparator.comparingInt(Fruit::getPrice))
				// return as a collection
				.collect(Collectors.toCollection(ArrayList::new));
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
	}
}