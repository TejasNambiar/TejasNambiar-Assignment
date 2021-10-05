package shapes_Q5;

public class Rectangle extends Shape {

	int l, b;
	
	public Rectangle() {}
	
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		area();
	}

	@Override
	public void area() {
		int area = l*b;
		System.out.println("Reactangle Area: "+area);
	}

}
