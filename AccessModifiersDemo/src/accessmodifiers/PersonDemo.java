package accessmodifiers;

import customers.Customer;

public class PersonDemo {

	public static void main(String[] args) {

		Person p1 = new Person("First", "Last");
		p1.firstName = "";
		
		Customer c1 = new Customer("CustomerFirstName", "CustomerLastName");
		
		Person r;
		
		r = p1;
		r.method1();
		
		r = c1;
		r.method1();
		
	}

}
