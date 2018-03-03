
class Box {
	
	double width;
	double height;
	
	//default or no argument constructor.
	//JVM will insert a no-arg or default constructor "Box(){}" in 
	//a class, when you don't provide any constructor.
	Box()
	{
		//width and height are assigned to 1 by default.
		width = 1;
		height = 1;
	}
	
	//Initialize object creation 
	//with custom width and height values.
	Box(double w, double h)
	{
		width = w;
		height = h;
	}
	
	Box(int h, double w)
	{
		width = w;
		height = h;
	}
	
	Box(int w, int h) {
		width = w;
		height = h;
	}
	
	//this is a method and not a constructor
	void Box(int w) {
		width = w;
		height = 1;
	}
	
	double getArea() {
		return (width * height);
	}
	
	void display() {
		
	}

}
