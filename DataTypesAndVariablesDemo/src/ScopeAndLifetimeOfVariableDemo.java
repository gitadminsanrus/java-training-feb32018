
public class ScopeAndLifetimeOfVariableDemo {

	int x1 = 10;//object scope
	
	int add (int x, int y) //x and y are in method scope
	{
		
		//result is in local scope
		int result = (x + y);
		result = result * 2;
		
		if (result > 100) 
		{
			//block scoped variable
			int abc = result - 100;
			
			if (abc > 0)
			{
				//block scoped variable accessible only in this 'if' block.
				int xyz = 20;
				System.out.println(abc);
			}
			
			System.out.println(xyz);
		}
		
		System.out.println(abc);//abc is defined in Block scope
		
		System.out.println(x1); 
		
		return result;
	}
	
	int sub (int a, int b) {
		
		x = 30;
		
		System.out.println(x1);
		
		return (a - b);
	}

}
