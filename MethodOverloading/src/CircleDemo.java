
public class CircleDemo {
	public static void main(String[] args) {
		Circle circle1 = getCircle(10);
		Circle circle2 = new Circle(20);
		
		System.out.println(circle1.getArea());
	}
	
	static Circle getCircle(double radius) {
		Circle circle = new Circle(radius);
		return circle;
	}
}
