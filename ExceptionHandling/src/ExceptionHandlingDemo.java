
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		int[] marks = new int[5];
		
		int initialMark = 90;
		int result = 10;
		
		for (int index = 0; index < result; index++) {
			
			try 
			{
				marks[index] = initialMark + 1;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index = " + index + 
						" could not be accessed. Exception reason from JVM = " 
						+ e.getMessage());
			}
			finally
			{
				System.out.println("Finally block will be executed even if there is an exception or not");
			}
		}
	}

}
