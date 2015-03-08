
public class Game {
	
	private String homeTeam;
	private String awayTeam;

	public Game(String homeTeam, String awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public void setAwayTeam(String awayTeam){ 
		this.awayTeam = awayTeam;
	}
	public String getHomeTeam() {
		return homeTeam;
		
	}
	public String getAwayTeam() {
		return awayTeam;
	}
}
