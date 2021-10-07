package annotations;

@interface Info{
	String author() default "NA";
	int authorID();
	String supervisor() default "NA";
	String date();
	String time();
	String version();
	String description();
}

class B{
	@Info
    public void showData(){
        System.out.println("in A");
    }
}

public class InfoAnnotation {

	public static void main(String[] args) {
		B obj = new B();
		obj.showData();
	}

}
