import java.util.Comparator;

public class PersonComparisonByFirstName implements Comparator<Person> {
	
	private boolean isAscending;
	
	public PersonComparisonByFirstName(boolean isAscending) {
		this.isAscending = isAscending;
	}
	
	

	@Override
	public int compare(Person p1, Person p2) {
		if (isAscending) {
			return (p1.getFirstName().compareTo(p2.getFirstName()));
		} else {
			return (p2.getFirstName().compareTo(p1.getFirstName()));
		}
	}



//	@Override
//	public int compare(Object o1, Object o2) {
//		if (!(o1 instanceof Person && o2 instanceof Person)) {
//			return -1;
//		} else {
//			Person p1 = (Person) o1;
//			Person p2 = (Person) o2;
//			
//			if (isAscending) {
//				return (p1.getFirstName().compareTo(p2.getFirstName()));
//			} else {
//				return (p2.getFirstName().compareTo(p1.getFirstName()));
//			}
//		}
//	}
	
	

}
