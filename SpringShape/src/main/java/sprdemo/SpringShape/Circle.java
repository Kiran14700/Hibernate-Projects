package sprdemo.SpringShape;

public class Circle implements Shape {
	public String color;

	public Circle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing"+color+"circle");
		
	}

}
