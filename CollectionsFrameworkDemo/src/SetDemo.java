import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set setOfObjects = new TreeSet();
		setOfObjects.add(10);
		setOfObjects.add(10);
		setOfObjects.add(10);
		setOfObjects.add(10);
		setOfObjects.add(10);
		setOfObjects.add(30);
		setOfObjects.add(40);
		setOfObjects.add(30);
		setOfObjects.add(20);
		setOfObjects.add(5);
		setOfObjects.add(1);
		setOfObjects.add(3);
		
		System.out.println(setOfObjects.size());
		
		Iterator it = setOfObjects.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Person p1 = new Person("A", "B", "P001", 'M', 20);
		Person p2 = new Person("A", "B", "P001", 'M', 20);
		Person p3 = new Person("A", "B", "P001", 'M', 20);
		
		Set setOfPersons = new HashSet();
		setOfPersons.add(p1);
		setOfPersons.add(p2);
		setOfPersons.add(p3);
		
		Iterator personIterator = setOfPersons.iterator();
		while (personIterator.hasNext()) {
			System.out.println(personIterator.next());
		}
		

	}

}
