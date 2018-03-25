package interfaces;

public abstract class Player {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	protected char gender;
	protected int score;
	protected int level;
	protected String country;
	
	protected Player(String firstName, String lastName, int age, char gender, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getScore() {
		return score;
	}

	public int getLevel() {
		return level;
	}

	public String getCountry() {
		return country;
	}
	
	
	
}
