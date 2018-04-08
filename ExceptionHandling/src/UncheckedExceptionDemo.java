
public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		int[] marks = new int[5];
		int index = 51;
		
		//throws an ArrayIndexOutOfBoundsException in the below statement.
		//this is an unchecked exception and hence try-catch block is OPTIONAL 
		marks[51] = 100;

		//remedy code to avoid ArrayIndexOutOfBoundsException
//		if (index < marks.length) {
//			marks[index] = 100;
//		} else {
//			System.out.println("Index = " + index + " is out of marks array bounds.");
//		}
		
		

	}

}
