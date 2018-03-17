package finalkeyword;

//applying 'final' keyword to the class prevents class inheritance
//If the class is not inherited, then its members (instance variables and methods) 
//also wont be inherited.
public final class Person {
	
	private final String firstName;
	private final String lastName;
	private int age;
	
	//final keyword to method/constructor argument prevents changing their values inside their scope.
	public Person(final String fName, final String lName) {
		firstName = fName;
		lastName = lName;
		
		//local constant; scope = constructor
		final int z;
		z = 30;
		
//			fName = "ABC"; => Compile error
	}
	
	public Person(final String fName, final String lName, int age) {
		firstName = fName;
		lastName = lName;
		this.age = age;
	}
	
	public Person(String fName) {
		firstName = fName;
		lastName = "";
	}
	
//	public void setFirstName(String f_Name) {
//		firstName = f_Name;
//	}
	
	//final keyword for the method prevents method overriding in subclass.
	public String getFullName() {
		return (firstName + " " + lastName);
	}
	
	//final keyword to method arguments prevents 
	public void method1(final int x) {
		
		//local constant; scope = method
		final int y;
		
		int z = 2 + 3;
		y = z;
//		y = x;//compile error as y was initialized already
		
		System.out.println(y);
//		y++; =>
	}
}
