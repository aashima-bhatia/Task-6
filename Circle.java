package task;

public class Circle {
	// data member
	private double radius;
	
	// no-argument constructor
	public Circle() {
		this.radius=0.0; //defualt radius
	}
	// constructor with one argument
	public Circle(double radius) {
		this.radius = radius;
	}
	// getter for radius
	public double getRadius() {
		return radius;
	}
	// setter for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// method to calculate circumfarance
	public double calCircum() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		// using no-argument constructor
		Circle circle1 = new Circle();
		System.out.println("Circle1 radius " + circle1.getRadius());
		System.out.println("Circumference = " + circle1.calCircum());
		// using constructor with argument
		Circle circle2 = new Circle(6.0);
		System.out.println("Circle2 radius " + circle2.getRadius());
		System.out.println("Circumference = " + circle2.calCircum());
		// changing radius using setter
		circle2.setRadius(8);
		System.out.println("Circle2 updated radius " + circle2.getRadius());
		System.out.println("Circumference = " + circle2.calCircum());

	}

}
