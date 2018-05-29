import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList listOfObjects = new ArrayList();
		listOfObjects.add(10);
		listOfObjects.add("Hello");
		listOfObjects.add(23.5);
		
		System.out.println("Size = " + listOfObjects.size());
		listOfObjects.remove(Integer.valueOf(10));
		
//		for (int index = 0; index < listOfObjects.size(); index++) {
//			System.out.println(listOfObjects.get(index));
//		}
		
		Iterator it = listOfObjects.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
