package stringClass;

public class StringClassAsgmt {

	public static void main(String[] args) {
		String string = "Hello World";
		System.out.println("Q1. String length: "+string.length());
		
		System.out.println("-----------------------------------------------------------------------");
		
		String str1 = "Hello", string2 = " How are you?";
		System.out.println("Q2. String concated: "+str1.concat(string2));
		
		System.out.println("-----------------------------------------------------------------------");
		
		str1 = "Java String pool refers to collection which are stored in heap memory";
		
		System.out.println("3.a.: "+str1.toLowerCase());
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("3.b.: "+str1.toUpperCase());
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("3.c.: "+str1.replace('a','$'));
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("3.d.: "+str1.contains("collection"));
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("3.e.: "+str1.equals("java string pool refers to collection which are stored in heap memory"));
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("3.f.: "+str1.equalsIgnoreCase("Java String pool refers to collection which are stored in heap memory"));
		System.out.println("-----------------------------------------------------------------------");
		
		
	}

}
