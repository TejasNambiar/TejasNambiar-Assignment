package annotations;

@interface Test{}

class A{
	@Test
    public void showData(){
        System.out.println("in A");
    }
}

public class TestAnnotation {

	public static void main(String[] args) {
		A obj = new A();
		obj.showData();
	}

}
