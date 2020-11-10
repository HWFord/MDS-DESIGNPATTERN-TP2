package fr.mds.designpattern.tps.entites;

import java.util.Arrays;
import java.util.List;

public class ShapeMaker {
	
	private String CIRCLE = "circle";
	
	private List<Shape> shapes= Arrays.asList(new Circle(), new Rectangle(), new Square());
	
	public ShapeMaker() {
		
	}
		
		public void drawCircle(){
			Shape shape1 = new Circle();
			shape1.draw();
		}

		
		public void drawRectangle() {
			Shape shape2 = new Rectangle();
			shape2.draw();
		}
		
		public void drawSquare() {
			Shape shape3 = new Square();
			shape3.draw();	
		}

	

	public void draw(String circle1) {
		this.CIRCLE = circle1;
	}

	public String getCIRCLE() {
		return CIRCLE;
	}

	
	
}
