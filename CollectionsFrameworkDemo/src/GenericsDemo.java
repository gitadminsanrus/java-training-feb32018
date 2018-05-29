import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(10);
		list.add("ABC");
		
		Person p1 = new Person("A", "B", "P001", 'M', 25);
		
		List<Person> listOfPersons = new ArrayList<>();
		listOfPersons.add(p1);
		
		Map<String, Person> maps = new HashMap<>();
		maps.put("P001", p1);

	}

}
