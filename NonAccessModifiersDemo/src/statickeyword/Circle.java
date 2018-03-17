package statickeyword;

public class Circle {
	
	//static members are in Class scope, 
	//common / shared variable for all the objects in object scope.
	public static final double PI = Math.PI;
	private static int count;
	
	
	//radius is in object scope (instance scope)
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		count++;
	}
	
	public double area() {
		return PI * radius * radius; 		
	}
	
	public static int getCount() {
		//radius = 10;// static scope cannot access instance/object scope members		
		return count;
	}
}
