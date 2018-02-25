
public class SingleDimensionalArrayDemo 
{

	public static void main(String[] args) 
	{
		
		//normal variable declaration
		int a, b, c;
		
		a = 1;
		b = 4;
		
		//single Dimen array declaration
		int marks[];
		
		//array initialization
		//Method 1:
		marks = new int[a + b]; // { [0], [1], [2], [3], [4] }
		marks[0] = 80;
		marks[1] = 85;
		marks[2] = 90;
		marks[3] = 95;
		marks[4] = 92;
		
		System.out.println("English = " + marks[0]);
		System.out.println("Physics = " + marks[1]);
		System.out.println("Math = " + marks[2]);
		System.out.println("Chemistry = " + marks[3]);
		System.out.println("Social Science = " + marks[4]);
		
		System.out.println(marks);
		System.out.println("=============================================");
		
		//Method2:
		marks = new int[] {82, 85, 90, 95, 92};
		marks[0] = 90;
		
		System.out.println("English = " + marks[0]);
		System.out.println("Physics = " + marks[1]);
		System.out.println("Math = " + marks[2]);
		System.out.println("Chemistry = " + marks[3]);
		System.out.println("Social Science = " + marks[4]);
		System.out.println(marks);
		
		//Method3: 
		int marks1[] = {80, 85, 90, 95, 92};
	
	}

}
