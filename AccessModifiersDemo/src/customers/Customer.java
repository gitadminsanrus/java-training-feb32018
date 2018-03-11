package customers;

import accessmodifiers.Person;

public class Customer extends Person {
	
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
		
//		Person p1 = new Person();
		
		//protected member is for inheritance only.
//		p1.firstName = "";
		
		firstName = "";
	}
	
	//this is not method overriding, instead
	//customer class has defined its own version of method1()
	public void method1()
	{
		System.out.println("Customer::method1()");
	}

}
