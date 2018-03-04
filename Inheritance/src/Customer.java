//Customer = Customer + Person
public class Customer extends Person {

	String customerId;
	String postalCode;
	int i = 20;
	
	Customer(String firstName, String lastName, String customerId)
	{
		super(firstName, lastName);
		this.customerId = customerId;
	}
	
	void displayCustomerId() {
		System.out.println("Customer Id = " + customerId);
	}
	
	void printI() {
		System.out.println("super.i = " + super.i);
		System.out.println("i = " + i);
	}
	
	//overloading method1() from Person
	void method1(int x)
	{
		
	}
	
}
