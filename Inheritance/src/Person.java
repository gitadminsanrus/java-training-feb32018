
public class Person extends Object {
	
	String firstName;
	String lastName;
	int age;
	char gender;//'M' or 'F' => by default gender will be '\0' (null or no character)
	double height;
	int i = 10;
	
	Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String getFullName() {
		return (firstName + " " + lastName);
	}
	
	void method1()
	{
		
	}

}
