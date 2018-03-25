package players;

public abstract class CricketPlayer extends Player {

	public CricketPlayer(String firstName, String lastName, int age, char gender, String country) {
		super(firstName, lastName, age, gender, country);
	}
	
	public abstract void bat();
	public abstract void bowl();
	public abstract void wicketKeeping();
	public abstract void fielding();
	
}
