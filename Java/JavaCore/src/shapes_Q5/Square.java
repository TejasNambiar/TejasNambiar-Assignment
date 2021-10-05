package shapes_Q5;

public class Square extends Shape {

	int side;
	
	public Square() {}
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square");
		area();
	}

	@Override
	public void area() {
		int area = side*side;
		System.out.print("Square Area: "+area);
	}

}
