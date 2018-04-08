
public class StackOverflowErrorDemo {

	public static void main(String[] args) {
		//errors must never be caught even thought that they can be caught in our try-catch block.
		try {
			while (true) {
				main(args);
			}
		}
		catch (StackOverflowError e)
		{
			System.out.println("Stack exploded." + e.getMessage());
		}
		finally
		{
			System.out.println("Finally block got executed.");
		}

	}

}
