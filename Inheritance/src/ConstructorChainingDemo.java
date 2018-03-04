
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer("Santhosh", "Gutta", "CUST001");
		
		System.out.println(c1.age);
		
		c1.method1();
	}
}
