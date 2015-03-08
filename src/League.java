
import java.util.*;
public class League {
	String[] teams = {"Chelsea", "Liverpol","Man Utd","Man City",};
	
	String[][] schedule;
	
	public League() {
		
		this.teams = new String[10];
		
	}
	public void makeSchedule(String[] teams) {
		String[][] leagueSchedule = new Game[teams.length][teams.length];
		for(int i = 0; i < teams.length;i++) {
				leagueSchedule[i][j] = setHomeTeam(League(i));
			for(int j = 0; i < teams.length;i++) {
				leagueSchedule[i][j] = setAwayTeam(j);
			}
		}
	}
}
