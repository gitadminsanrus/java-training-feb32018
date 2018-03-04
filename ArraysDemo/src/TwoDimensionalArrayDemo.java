
public class TwoDimensionalArrayDemo 
{

	public static void main(String[] args) 
	{
				
		//Two Dimen array declaration
		int studentMarks[][];
		
		int noOfStudents = 10; 
		int noOfCourses = 5;
		
		//array initialization
		//Method 1:
		//creates an array of 10 rows and 5 columns.
		studentMarks = new int[noOfStudents][noOfCourses];
		
		//setting course values to first student
		//accessing first row [0] and first column[0]
		studentMarks[0][0] = 80;
		studentMarks[0][1] = 85;
		studentMarks[0][2] = 90;
		studentMarks[0][3] = 95;
		studentMarks[0][4] = 92;
		
		studentMarks[1][0] = 81;
		studentMarks[1][1] = 86;
		studentMarks[1][2] = 91;
		studentMarks[1][3] = 96;
		studentMarks[1][4] = 93;
		
		System.out.println("Student 1 Marks");
		System.out.println("English = " + studentMarks[0][0]);
		System.out.println("Physics = " + studentMarks[0][1]);
		System.out.println("Math = " + studentMarks[0][2]);
		System.out.println("Chemistry = " + studentMarks[0][3]);
		System.out.println("Social Science = " + studentMarks[0][4]);
		
		System.out.println("--------------------------------");
		
		System.out.println("Student 2 Marks");
		System.out.println("English = " + studentMarks[1][0]);
		System.out.println("Physics = " + studentMarks[1][1]);
		System.out.println("Math = " + studentMarks[1][2]);
		System.out.println("Chemistry = " + studentMarks[1][3]);
		System.out.println("Social Science = " + studentMarks[1][4]);
		
		
		System.out.println("No of rows = " + studentMarks.length);
		System.out.println("No of columns for 1st student = " + studentMarks[0].length);
		
		System.out.println("=============================================");
		
		//Method2:
		//JAGGED array
		
		int student1English = 90;
		studentMarks = new int[][] {
										{student1English, 85, 90, 95, 92}, 
										{81, 86, 91, 96}, 
										{75, 76, 77}, 
										{80, 90}
								   };
		
		
		
		//Method3: 
		int studentMarks1[][] = 
							{
								{80, 85, 90, 95, 92}, 
								{81, 86, 91, 96}, 
								{75, 76, 77}, 
								{80, 90}
						    };
		
		//at first, we are navigating the array by row
		for (int rowIndex = 0; rowIndex < studentMarks.length; rowIndex++) 
		{
			int[] studentRow = studentMarks[rowIndex];
			
			for (int columnIndex = 0; columnIndex < studentRow.length; columnIndex++)
			{
//				System.out.println(studentRow[columnIndex]);
				System.out.println(studentMarks[rowIndex][columnIndex]);
			}
		}
	
	}

}
