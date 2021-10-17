package functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String[] args) {

		/**
		 * function<param1, param2>
		 * @params1 - input type
		 * @params2 - return type
		 */
		Function<Integer, Double> interface1 = a -> a / 2.0;
		  
        // apply the function to get the result
        System.out.println(interface1.apply(10));
        
        /**
         * Suppliers are useful when we don’t need to supply any value 
         * and obtain a result at the same time.
         */
        Supplier<Double> interface2 = () -> Math.random();
        
        // we call the random value using get()
        System.out.println(interface2.get());
        
        /**
         * Predicate is useful as can take value without return type
		 * @params1 - input type
		 * test(T t) : Evaluates this predicate on the given 
		 * argument.boolean test(T t)
         */
        Predicate<Integer> lesserthan = i -> (i < 18); 
        
        // Calling Predicate method to check if number provided is smaller than threshold
        if(lesserthan.test(19))
        	System.out.println("executed");
        else {
			System.out.println("failed");
		}
        /**
         * The lambda expression assigned to an object of Consumer 
         * type is used to define its accept() which eventually applies 
         * the given operation on its argument.
         * Consumers are useful when it not needed to return any
         * value as they are expected to operate via side-effects. 
         */
        Consumer<String> display = a -> System.out.println(a);
        
        // Implement display using accept()
        display.accept("Java is  __tough but interesting__ ");

	}

}
