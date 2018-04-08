
public class ThrowKeywordDemo {

	public static void main(String[] args) {
		
		try 
		{
			RuntimeException re = new RuntimeException();
			throw re;
		}
		catch (RuntimeException e) 
		{
			System.out.println("Manually thrown unchecked RuntimeException object is caught in here.");
		}
		finally
		{
			System.out.println("Completing final operations in finally{} block.");
		}
		
		System.out.println("Hello World");
		
		
		try {
			Exception e1 = new Exception();
			throw e1;
		}
		catch (Exception e) {
			System.out.println("Checked exception is manually thrown");
		}
	}

}
