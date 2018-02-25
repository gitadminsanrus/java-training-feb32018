import java.util.Scanner;

public class DoWhileStatementDemo {

	public static void main(String[] args) {
		
		int input = 0;//initializing char variable to null character
		
		//System.in => refers to the inbuilt keyboard
		//Scanner is a JDK class that will scan for the key inputs.
		Scanner scanner = new Scanner(System.in);
		
		do
		{
			System.out.println("Menu Selection");
			System.out.println("--------------------------");
			System.out.println("1. Coffee");
			System.out.println("2. Tea");
			System.out.println("3. Pizza");
			System.out.println("4. Pasta");
			System.out.println("\n\n");
			System.out.println("Press '-999' to exit the menu.\n Thank you!.");
			System.out.println("=============================");
			
			System.out.print("Input > ");
			input = scanner.nextInt();
			
			switch (input) {
				case 1:
					System.out.println("Ordering cofee...2 mins to prepare.");
					break;
					
				case 2:
					System.out.println("Ordering tea...3 mins to prepare.");
					break;
					
				case 3:
					System.out.println("Ordering Pizza...15 mins to prepare.");
					break;
					
				case 4:
					System.out.println("Ordering Pasta...10 mins to prepare.");
					break;
			}
		}
		while(input != -999);

	}

}
