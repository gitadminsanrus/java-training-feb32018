import java.util.Scanner;

public class ReadFromKeyboardDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input an ID: ");
		int id = scanner.nextInt();
		
		System.out.print("Enter first name: ");
		String firstName = scanner.next();
		
		System.out.println("ID = " + id + ", First Name = " + firstName);

	}

}
