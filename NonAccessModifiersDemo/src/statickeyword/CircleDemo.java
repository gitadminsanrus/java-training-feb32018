package statickeyword;

public class CircleDemo {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(10);
		System.out.println(Circle.getCount());
		
		//static members can be directly accessed using class name
		System.out.println(Circle.PI);
		System.out.println(circle1.PI);
		
		Circle circle2 = new Circle(20);
		System.out.println(Circle.getCount());
		
		Circle circle3 = new Circle(30);
		System.out.println(Circle.getCount());
		
//		for (int i = 0; i < 100; i++) {
//			Circle myCircle = new Circle(i);
//			System.out.println(myCircle.area());
//		}
		
		System.out.println("Circle 1 Area = " + circle1.area());
		System.out.println("Circle 2 Area = " + circle2.area());
		System.out.println("Circle 3 Area = " + circle3.area());
		
		A a1 = new A();
		B b1 = new B();
		
		System.out.println(a1.X);
		System.out.println(A.X);
		
		System.out.println(b1.X);
		System.out.println(B.X);
		System.out.println(b1.Y);
		System.out.println(B.Y);
		
		A r = a1;
		System.out.println("(a1) => r.getX() => " + r.getX());
		
		r = b1;
		System.out.println("(b1) => r.getX() => " + r.getX());
		
	}

}
