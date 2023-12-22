package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Cafú");
        Team team = new Team("Brazil");
        Player[] players = {player1, player2};

        team.setPlayers(players);

        player1.setTeam(team);
        player2.setTeam(team);

        System.out.println("------ Player --------");
        player1.print();
        player2.print();

        System.out.println("------ Team --------");
        team.print();

    }
}