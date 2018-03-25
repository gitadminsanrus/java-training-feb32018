package demo;
import players.MariaSharapova;
import players.SachinTendulkarWithCricket;

public class PlayerDemo {

	public static void main(String[] args) {
		
		SachinTendulkarWithCricket sachinTendulkar = new SachinTendulkarWithCricket();
		sachinTendulkar.bat();
		sachinTendulkar.bowl();
		sachinTendulkar.wicketKeeping();
		sachinTendulkar.fielding();
		
		MariaSharapova mariaSharapova = new MariaSharapova();
		mariaSharapova.strikeBall();

	}

}
