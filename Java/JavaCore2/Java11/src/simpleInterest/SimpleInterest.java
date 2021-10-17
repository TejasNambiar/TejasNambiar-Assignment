package simpleInterest;

public class SimpleInterest {

	public static void main(String[] args) {
		int t = 10, r = 10, p = 2000;
		Lambda lambda = () -> p * t * r / 100;
		System.out.println("total simple interest: " + lambda.simpleInterest());
	}

}

interface Lambda {
	int simpleInterest();
}