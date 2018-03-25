package players;

public class SachinTendulkarWithTennis extends TennisPlayer {
	
	private static final String FIRST_NAME = "Sachin";
	private static final String LAST_NAME = "Tendulkar";
	private static final int AGE = 45;
	private static final char GENDER = 'M';
	private static final String BIRTH_COUNTRY = "India";
	
	public SachinTendulkarWithTennis() {
		super(FIRST_NAME, LAST_NAME, AGE, GENDER, BIRTH_COUNTRY);
	}

	public void strikeBall() {
		System.out.println("sachin way of playing tennis");
	}

}
