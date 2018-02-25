/**
 * 
 * @author Sanrus Training Centre
 * @since Feb 25, 2018
 * 
 * This file represents a Box class
 * and also demonstrates the presence
 * of non public classes as well.
 *
 */
public class Box {
	double length;
	double width;
	double thickness;
	
	/*
	 * Method Name: display
	 * Input Params: No Input passed '()'
	 * Return value/type: void => No return value from the method
	 */
	void display()
	{
		System.out.println("Length = " + length);
		System.out.println("Width = " + width);
		System.out.println("Thickness = " + thickness);
	}
	
	double calculateArea()
	{
		if (length > 0) {
			double area = length * width * thickness;
			return area;
		} else {
			return 0;
		}
	}
	
	void addValueToLength(int value) {
		length = length + value;
	}
	
	double addValuesAndReturnArea(double l, double w, double t) {
		length += l;
		width += w;
		thickness += t;
		
		return (length * width * thickness);
	}
	
	int getVolume() {
		byte b = 80;
		return (int) (length * width * thickness);
	}
}

//non public classes
class Circle {
	double radius;
}

class Rectangle {
	double width;
	double length;
}