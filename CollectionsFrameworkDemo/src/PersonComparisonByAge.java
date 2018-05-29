import java.util.Comparator;

public class PersonComparisonByAge implements Comparator {
	
	private boolean isAscending;
	
	public PersonComparisonByAge(boolean isAscending) {
		this.isAscending = isAscending;
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (!(o1 instanceof Person && o2 instanceof Person)) {
			return -1;
		} else {
			Person p1 = (Person) o1;
			Person p2 = (Person) o2;
			
			if (isAscending) {
				return (p1.getAge() - p2.getAge());
			} else {
				return (p2.getAge() - p1.getAge());
			}
		}
	}
	
}
