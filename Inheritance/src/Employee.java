//Employee = Employee + Person
public class Employee extends Person {
	String employeeId;
	String department;
	
	Employee(String firstName, String lastName, String employeeId)
	{
		super(firstName, lastName);
		this.employeeId = employeeId;
		System.out.println("Employee constructor...");
	}
}
