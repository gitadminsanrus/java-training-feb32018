
public class SwitchStatementDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * Business Requirements:-
		 * 
		 * if x is 0, print "Tiny"
		 * else if x is 10, print "Small"
		 * else if x is 100, print "Medium"
		 * else if x is 1000, print "Large"
		 * else print "Invalid Data"
		 */
		
		char x = 'A';
		int y = 20;
		
		if (x == 0)
		{
			System.out.println("Tiny");
		}
		else if (x == 10)
		{
			System.out.println("Small");
		}
		else if (x == 100)
		{
			System.out.println("Medium");
		}
		else if (x == 1000)
		{
			System.out.println("Large");
		}
		else if (x == 65 || x == 66 || x == 67)
		{
			System.out.println("do common operation");
			
			if (x == 65)
			{
				System.out.println("do when x = 'A'");
			}
			else if (x == 66)
			{
				
			}
		}
		else 
		{
			System.out.println("Invalid Data");
		}
		
		
		switch (x)
		{
			default:
				System.out.println("Invalid Data");
				break;
			
			case 0:
				System.out.println("Tiny");
				break;

			case (65 + 5):
				System.out.println("A");
			case 66:
				System.out.println("B");
			case 67:
			case 68:
				System.out.println("This is an alphabet");
				break;
				
			case 100:
				System.out.println("Medium");
				break;
				
			case 1000:
				System.out.println("Large");
				break;
				
			
			
		}
	}

}
