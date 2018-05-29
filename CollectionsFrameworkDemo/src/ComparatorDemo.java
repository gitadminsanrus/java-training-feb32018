import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("A", "B", "P001", 'M', 30);
		Person p2 = new Person("A3", "B3", "P003", 'M', 27);
		Person p3 = new Person("A2", "B2", "P002", 'M', 22);
		Person p4 = new Person("A4", "B4", "P004", 'M', 29);
		
		List listOfObjects = new ArrayList();
		listOfObjects.add(p1);
		listOfObjects.add(p2);
		listOfObjects.add(p3);
		listOfObjects.add(p4);
		listOfObjects.add(new Address());
		
		PersonComparisonByAge personComparisonByAge = new PersonComparisonByAge(false);
		PersonComparisonByFirstName byFirstName = new PersonComparisonByFirstName(false);
		
		Collections.sort(listOfObjects, byFirstName);
		
		Iterator it = listOfObjects.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	

	}

}
