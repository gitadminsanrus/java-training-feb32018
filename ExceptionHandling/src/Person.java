public class Person {	
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	public Person(String firstName, 
					String lastName,
					int age, 
					char gender) throws FirstNameValidationException, LastNameValidationException{
		
		if (firstName == null || firstName.length() < 2) {
			throw new FirstNameValidationException("First Name is required and must be of at least 2 characters.");
		}
		
		if (lastName == null || lastName.length() < 2) {
			throw new LastNameValidationException("Last Name is required and must be of at least 2 characters.");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
	public void method1() throws RuntimeException {
		
	}

}
