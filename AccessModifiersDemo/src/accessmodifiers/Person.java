package accessmodifiers;

public class Person {
	
	//firstName instance variable is visible to only Person class
	protected String firstName;
	private String lastName;
	
	private Person()
	{
		super();
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	//this method can only be called from within Person class
	protected void method1() {
		System.out.println("Person::method1()");
	}
	
	public String getFullName() {
		
		method1();
		
		return (firstName + " " + lastName);
	}
	
	
}
