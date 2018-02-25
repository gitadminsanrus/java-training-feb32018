
public class IfConditionStatementDemo {

	public static void main(String[] args) {
		
		int x = -1;//let us assume x value is coming from the keyboard
		
		/*
		 * (multi-line commenting)
		 * Business Requirements:-
		 * 
		 * 
		 * 0 	<= 	x 	< 10		, print "tiny"
		 * 10 	<= 	x	< 100	, print "small"
		 * 100	<=	x	< 1000	, print	"medium"
		 * 1000	<=	x			, print "large"
		 * 
		 * x < 0					, print "Invalid Data"
		 * 
		 */
		
		/*
		 * if block is mandatory, and else-if and else blocks are optional 
		 */
		
		//[0, 10)
		if (x >= 0 && x < 10)
		{
			System.out.println("tiny");
			
			int k = 10;
			if (k > 0)
			{
				
			}
			else if (k > 10)
			{
				
			}
			else if (k > 100)
			{
				
			}
			else 
			{
				
			}
			
		}
		else if (x >= 10 && x < 100) //[10, 100)
		{
			System.out.println("small");
		}
		else if (x >= 100 && x < 1000) //[100, 1000) 
		{
			System.out.println("medium");
		}
		else if (x >= 1000) //[1000, Infinity)
		{
			System.out.println("large");
		}
		else // else block is optional
		{
			System.out.println("Invalid Data");
		}
		

	}

}
