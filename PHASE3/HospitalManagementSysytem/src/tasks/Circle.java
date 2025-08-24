package tasks;

public class Circle {
	
	private final double pi = 3.14;//Constant pi value
	private double area = 0;
	private int radius;
	
	//Constructor
	Circle(int radius) {
		this.radius = radius;
	}
	//Calculate the area of circle
	public double area()
	{
		area = pi * radius * radius;
		return area;
	}
	
}
