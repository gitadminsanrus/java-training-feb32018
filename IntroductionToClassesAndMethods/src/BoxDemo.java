/**
 * 
 * @author Sanrus Training Centre
 * @since Feb 25, 2018
 *
 * A demo class to demonstrate the 
 * creation and usage of Box object.
 * 
 */
public class BoxDemo {

	//entry point for code execution
	public static void main(String[] args) {
		
		//Instance variable declaration with name 'box1'
		Box box1;
		
		//Box object creation and assignment
		box1 = new Box();
		
		//box1 and box2 points to the same box object 
		//that was originally created for box1 
		Box box2 = box1;
		
		box1.length = 15;
		box1.width = 7.5;
		box1.thickness = 4;
		
		System.out.println("Length of box1 = " + box1.length);
		System.out.println("Width of box1 = " + box1.width);
		System.out.println("Thickness of box1 = " + box1.thickness);
		
		System.out.println("===================================");
		System.out.println("After box object Modification");
		System.out.println("===================================");
		
		box2.length = 10;
		box2.thickness = 5;
		
		System.out.println("Length of box1 = " + box1.length);
		System.out.println("Width of box1 = " + box1.width);
		System.out.println("Thickness of box1 = " + box1.thickness);
		
		System.out.println();
		
		System.out.println("Length of box2 = " + box2.length);
		System.out.println("Width of box2 = " + box2.width);
		System.out.println("Thickness of box2 = " + box2.thickness);
		
		System.out.println("\n===================================");
		
		box1.display();
		
		double area = box1.calculateArea();
		
		
	}

}
