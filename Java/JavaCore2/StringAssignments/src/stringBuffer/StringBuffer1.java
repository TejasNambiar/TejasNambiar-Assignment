package stringBuffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		String string = "StringBuffer";
		StringBuffer builder = new StringBuffer();
		builder.append(string);
		builder.append(" is a peer class of string");
		builder.append(" that provides much of ");
		builder.append("the functionality of strings");
		System.out.println("Q1: "+builder.toString());
		System.out.println("----------------------------------------------------------------");
		
		string = "it is used to _ at the specified index position";
		String insert = "insert text_";
		StringBuffer s=new StringBuffer();
		s = new StringBuffer(string);
		System.out.println("Q2: "+s.insert(s.indexOf("_")+1, insert));
		System.out.println("----------------------------------------------------------------");
		
		string = "this method returns reversed obj on which it was called";
		s = new StringBuffer(string);
		System.out.println("Q3: "+s.reverse());System.out.println("----------------------------------------------------------------");
		
		StringBuilder builder2 = new StringBuilder("Assignemnts on String Buffer Class using String Builder");
		System.out.println("Q4: "+builder2.toString());
	}

}
