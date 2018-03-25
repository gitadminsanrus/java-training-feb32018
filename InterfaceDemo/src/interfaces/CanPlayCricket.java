package interfaces;

public interface CanPlayCricket {
	
	public static final int NUMBER_OF_PLAYERS = 11;
	
	public abstract void bat();
	public abstract void bowl();
	public abstract void wicketKeeping();
	public abstract void fielding();
}
