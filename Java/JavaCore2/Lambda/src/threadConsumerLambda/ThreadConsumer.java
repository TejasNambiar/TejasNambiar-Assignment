package threadConsumerLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ThreadConsumer {

	class ThreadX implements Runnable {
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread X with i = " + -1 * i);
			}
			System.out.println("Exiting Thread X ...");
		}
	}

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// assigning type list on consumer, and uusing stream to print the list
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(System.out::println);

		// calling consumer using thread via lambda expression
		Thread t = new Thread(() -> dispList.accept(list1));

		/**
		 * starts the thread when invoked,
		 * 
		 * @Thread(arg) is called where the arg in specific is a lambda function that
		 *              gets executed
		 */
		t.start();

	}
}
