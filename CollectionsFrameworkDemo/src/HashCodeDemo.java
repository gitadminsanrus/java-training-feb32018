
public class HashCodeDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("A", "B", "P001", 'M', 20);
		Person p2 = new Person("A", "B", "P001", 'M', 20);
		Person p3 = new Person("A", "B", "P001", 'M', 20);
		
//		System.out.println(p1 == p2);
//		System.out.println(p2 == p3);
//		System.out.println(p3 == p1);
//		
//		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

	}

}
