package interfaces;

public class MariaSharapova extends Player implements CanPlayTennis {
	
	private static final String FIRST_NAME = "Maria";
	private static final String LAST_NAME = "Sharapova";
	private static final int AGE = 50;
	private static final char GENDER = 'F';
	private static final String BIRTH_COUNTRY = "German";
	
	public MariaSharapova() {
		super(FIRST_NAME, LAST_NAME, AGE, GENDER, BIRTH_COUNTRY);
	}

	public void strikeBall() {
		System.out.println("Maria's way of striking the tennis ball.");
	}
	
}
