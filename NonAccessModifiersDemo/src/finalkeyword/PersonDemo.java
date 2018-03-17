package finalkeyword;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("First1");
		System.out.println(p1.getFullName());
		p1.method1(10);
		
//		p1.setFirstName("First11");
		
		System.out.println(p1.getFullName());

	}

}
