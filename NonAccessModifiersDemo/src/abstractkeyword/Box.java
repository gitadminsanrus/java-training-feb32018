package abstractkeyword;

abstract class Box {
	
	double width;
	double length;
	
	double area() {
		return width * length;
	}
	
	double perimeter() {
		return 0;
	}
}
