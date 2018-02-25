/**
 * 
 * @author Sanrus Training Centre
 * @version 1
 * @since 1.0
 * 
 * This class demonstrates various data types and their usage.
 *
 */
public class DataTypesAndVariablesDemo 
{

	//entry point for the java program
	public static void main(String[] args) 
	{
		
		//declaration of the variable
		byte b1;
		
		//initialization the variable
		b1 = 20;
		
		//reassign new value
		b1 = 50;
		
		//byte b1 = 70; => Declaring variable of same name that was declared before is not allowed.
		
		//declaration and initialization in one statement line.
		//byte data type
		byte b = 127;
		short s = -32768;
		int i = -2147483648;
		long l = 2147483648L;
		
		float f = 3.14F;
		double d = 5999933387897079707097097097098798707897070987970970709879709709723412341.03132412341234237612341234113412341;
		
		char ch = 'A';
		char degreeCharacter = '\u00B0';
		
		boolean result = true;
		boolean isCompleted = false;
		
		String value = "Java \" \\ Training";
		
		System.out.println("char ch => " + ch);
		System.out.println("Weather is 23" + degreeCharacter + " C");
		System.out.println('\u0950');
		System.out.println(10);
		System.out.println("Result => " + result);
		System.out.println(isCompleted);
		System.out.println(value);
		
		
		//printing byte 'b' value to the console
		System.out.println("byte b => " + b);
		
		//printing double 'd' value to the console
		System.out.println("double d => " + d);
		

	}

}
