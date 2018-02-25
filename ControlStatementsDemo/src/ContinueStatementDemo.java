
public class ContinueStatementDemo {

	public static void main(String[] args) {
		
		/*
		 * Requirement: Print even numbers till 1000
		 */
		
		int x = -1;
		
		while (x++ <= 1000)
		{
			//if odd number, then continue with looping but do not the execute
			//any block statements after 'continue';
			if (x % 2 == 1) {
				continue;
			}
			
			System.out.println(x);
			
		}
		
		for (int y = 0; y <= 1000; y++)
		{
			if ( y % 2 == 1)
			{
				continue;
			}
			
			System.out.println(y);
		}
		
		
		for (int a = 0; a < 10; a++)
		{
			for (int b = 0; b < 20; b++)
			{
				if (b == 5)
				{
					continue;
				}
			}
		}

	}

}
