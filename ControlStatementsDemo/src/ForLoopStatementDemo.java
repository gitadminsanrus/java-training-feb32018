
public class ForLoopStatementDemo {

	public static void main(String[] args) {
		
		int[] data = {10, -5, 4, 20, 99, 45, 39, 274, 3794, 
						10, -5, 4, 20, 99, 45, 39, 274, 3794, 
						10, -5, 4, 20, 99, 45, 39, 274, 3794};
		

		for (int index = 0; index < data.length; index++)
		{
			System.out.println(data[index]);
		}
		
		int x = 0;
		
		while (x < data.length)
		{
			System.out.println(data[x]);
			x++;
		}
		
		while (x < data.length)
		{
			System.out.println(data[x]);
			x++;
		}

	}

}
