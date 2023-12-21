package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team1 = new Team("Brazil's national team");
        // Team    1 -- M Player | one team can have many players but one player belongs a one team only
        player1.setTeam(team1);
        player1.print();

        
    }
}
