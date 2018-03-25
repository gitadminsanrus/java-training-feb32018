package interfaces;

public class SachinTendulkar extends Player implements CanPlayCricket, CanPlayTennis {

	private static final String FIRST_NAME = "Sachin";
	private static final String LAST_NAME = "Tendulkar";
	private static final int AGE = 45;
	private static final char GENDER = 'M';
	private static final String BIRTH_COUNTRY = "India";
	
	public SachinTendulkar() {
		super(FIRST_NAME, LAST_NAME, AGE, GENDER, BIRTH_COUNTRY);
	}

	public void bat() {
		System.out.println("Sachin way of batting.");
	}

	public void bowl() {
		System.out.println("Sachin way of bowling.");		
	}

	public void wicketKeeping() {
		System.out.println("Sachin way of wicket keeping.");		
	}

	public void fielding() {
		System.out.println("Sachin way of fielding.");		
	}

	public void strikeBall() {
		System.out.println("Sachin way of striking tennis ball.");		
	}
	
}
