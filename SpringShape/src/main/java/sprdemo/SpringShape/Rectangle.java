package sprdemo.SpringShape;

public class Rectangle implements Shape{
	private String color;
	

	

	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public void draw() {
		System.out.println("drawing a "+color+" rectangle");
		// TODO Auto-generated method stub
		
	}

}
