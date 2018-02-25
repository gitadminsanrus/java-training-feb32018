
public class BreakStatementDemo {

	public static void main(String[] args) {
		
		for (int a = 0; a < 10; a++)
		{
			if (a == 5)
			{
				break;
			}
			
			System.out.println(a);
		}
		
		
		for (int a = 0; a < 10; a++)
		{
			for (int b = 0; b < 20; b++)
			{
				if (b == 5)
				{
					break;
				}
			}
		}

	}

}
