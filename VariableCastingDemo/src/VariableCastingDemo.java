
public class VariableCastingDemo 
{

	public static void main(String[] args) 
	{
		
		int a = 10;
		long l = a;//widening conversion - automatically done by compiler
		
		// => byte b = a;//narrowing conversion - compilation fails
		byte b = (byte) a; // "(byte) a" => Explicitly convert from int (32 bits) to byte (8 bits)
		
		float f = 3F;
		double d = f;//widening conversion
		int a1 = (int) f;
		
		float f1 = (float) d;
		
		char ch = 'A';
		int a3 = ch;
		byte b3 = (byte) ch;
		float f2 = ch;
		
		System.out.println("f2 = " + f2);
		
		
		byte b5 = (byte) 12873461964L;
		System.out.println("b5 = " + b5);
		
		//int i8 = (int) true; => Compilation error
		
		char ch1 = (int) 65535;
		System.out.println(ch1);
	
	}

}
