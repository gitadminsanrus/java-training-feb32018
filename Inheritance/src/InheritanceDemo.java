
public class InheritanceDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.firstName = "A";
		p1.lastName = "B";
		p1.age = 20;
		p1.gender = 'M';
		p1.getFullName();
		
//		System.out.println("p1 instanceof Person => " + (p1 instanceof Person));
		System.out.println("p1 instanceof Object => " + (p1 instanceof Object));
		
		Customer c1 = new Customer();
		c1.firstName = "First";
		c1.lastName = "Last";
		c1.customerId = "CUST001";
		c1.age = 30;
		c1.gender = 'F';
		c1.getFullName();
		c1.printI();
		c1.displayCustomerId();
		
		System.out.println("c1 instanceof Person => " + (c1 instanceof Person));
		System.out.println("c1 instanceof Object => " + (c1 instanceof Object));
		
		Employee e1 = new Employee();
		e1.firstName = "FirstEmp";
		e1.lastName = "LastEmp";
		e1.age = 50;
		e1.gender = 'M';
		e1.employeeId = "EMP112";
		e1.department = "ELECTRICAL";
		e1.getFullName();
		
		

	}

}
