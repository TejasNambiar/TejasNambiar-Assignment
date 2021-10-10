package basicArithmetic;

public class BasicArithmetic {

	public static void main(String[] args) {

		int a = 10, b = 20;
		
		lamba1 addLamba1 = () ->{
			int result = a+b;
			System.out.println("add: "+result);
			System.out.println("-----------------------------");
		};
		
		lamba1 subtractLamba1 = () ->{
			int result = b-a;
			System.out.println("subtract: "+result);
			System.out.println("-----------------------------");
		};
		
		lamba1 multiplyLamba1 = () ->{
			int result = a*b;
			System.out.println("mutliply: "+result);
			System.out.println("-----------------------------");
		};
		
		lamba1 divideLamba1 = () ->{
			int result = b/a;
			System.out.println("divide: "+result);
			System.out.println("-----------------------------");
		};

		System.out.println("calling lambda methods");
		System.out.println("-----------------------------");
		addLamba1.arithmetics();
		subtractLamba1.arithmetics();
		multiplyLamba1.arithmetics();
		divideLamba1.arithmetics();
		
	}
	
}

interface lamba1{
	public void arithmetics();
}
