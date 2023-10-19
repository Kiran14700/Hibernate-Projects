package sprdemo.SpringShape;

public class Painter implements Performer{
	private Shape shape;
	
	public Painter() {
		super();
	}
	

	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public void perform() {
		System.out.println("Painter is");
		// TODO Auto-generated method stub
		shape.draw();
		
	}

}
