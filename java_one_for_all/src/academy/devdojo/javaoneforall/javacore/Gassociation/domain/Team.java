package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players){
        this.name = name;
        this.players = players;
    }

    public void print(){
        System.out.println(this.name);
        if (this.players != null) {
            for (Player player : players) {
                System.out.println(player.getName());
            }
        }
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getTeamName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
