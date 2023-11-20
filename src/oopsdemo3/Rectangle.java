package oopsdemo3;

public class Rectangle implements Shape {

	private double width,height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}
	@Override
	public double getArea() {
		return this.width*this.height;
	}
	
	
}
