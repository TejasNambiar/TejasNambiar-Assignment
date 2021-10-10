package orders;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Orders> list = new ArrayList<>();
		list.add(new Orders(10001, "Accepted"));
		list.add(new Orders(1050, "Completed"));
		list.add(new Orders(10001, "Failed"));
		list.add(new Orders(10001, "Failed"));
		list.add(new Orders(30001, "Completed"));
		list.add(new Orders(20001, "Failed"));
		list.add(new Orders(20001, "Accepted"));
		
		// covered question 3- consumer and predicate
		printOrders(list, o -> (o.getStatus().equalsIgnoreCase("accepted")
									|| o.getStatus().equalsIgnoreCase("completed"))
											&&o.getAmount()>10000, System.out::println);
	}

	private static void printOrders(List<Orders> list, Predicate<Orders> condition, Consumer<Orders> consumer) {

		for (Orders orders : list) {
			if(condition.test(orders))
				consumer.accept(orders);
		}
		
	}

}
