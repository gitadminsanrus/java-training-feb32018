package interfaces;

public class CricketGame {
	
	private CanPlayCricket[] cricketPlayersTeamA;
	private CanPlayCricket[] cricketPlayersTeamB;
	
	public CricketGame(CanPlayCricket[] cricketPlayersTeamA, 
								CanPlayCricket[] cricketPlayersTeamB) {
		this.cricketPlayersTeamA = cricketPlayersTeamA;
		this.cricketPlayersTeamB = cricketPlayersTeamB;
	}
	
	public void batFromTeamA() {
		cricketPlayersTeamA[0].bat();
	}

}
