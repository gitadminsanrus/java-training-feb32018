
public class ThrowsKeywordDemo {
	public static void main(String[] args) {
		try 
		{
			Person p1 = new Person("A", "Last", 25, 'f');
			
			int x = (2/ 10);
			
			int[] marks = new int[5];
			marks[10] = 90;
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Divide by zero not possible.");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException occurred.");
		}
		catch (RuntimeException e) 
		{
			
		}
		catch (FirstNameValidationException e) {
			System.out.println("First name required.");
		}
		catch(LastNameValidationException e) {
			System.out.println("Last name required.");
		}
		catch (Exception e) 
		{
			System.out.println("Project A => '" + e.getMessage() +"'");
		}
	}
}