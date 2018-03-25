package interfaces;

public class PlayerDemo {

	public static void main(String[] args) {
		
		SachinTendulkar sachinTendulkar = new SachinTendulkar();
		MariaSharapova mariaSharapova = new MariaSharapova();
		
		sachinTendulkar.strikeBall();
		
		CanPlayCricket canPlayCricket;
		CanPlayTennis canPlayTennis;
		
		canPlayCricket = sachinTendulkar;
		canPlayCricket.bat();
		canPlayCricket.bowl();
		canPlayCricket.fielding();
		canPlayCricket.wicketKeeping();
		
//		canPlayCricket = mariaSharapova;
		
		canPlayTennis = mariaSharapova;
		canPlayTennis.strikeBall();
		
		canPlayTennis = sachinTendulkar;
		canPlayTennis.strikeBall();
		
	}

}
