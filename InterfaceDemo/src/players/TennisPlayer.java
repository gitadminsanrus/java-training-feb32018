package players;

public abstract class TennisPlayer extends Player {

	protected TennisPlayer(String firstName, String lastName, int age, char gender, String country) {
		super(firstName, lastName, age, gender, country);
	}
	
	public abstract void strikeBall();
	
}
