package Encapsulation;

import java.util.ArrayList;
import java.util.List;

// Player class
class Player {
    private int id;
    private String team;
    private String name;

    public Player(String name, int id, String team){
        this.id = id;
        this.team = team;
        this.name = name;
    }

}

/* Team class contains a list of Player
Objects.*/
class Team {
    private String name;
    private List<Player> players;

    public Team(String name, List<Player> players){
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers(){
        return players;
    }

}

/* School class contains a list of Team
Objects.*/
class School {
    String schoolName;
    private List<Team> teams;

    public School(String schoolName, List<Team> teams){
        this.schoolName = schoolName;
        this.teams = teams;
    }

    public int getTotalPlayersInSchool(){
        int countOfPlayers = 0;
        for (Team team: teams) {
            for (Player player: team.getPlayers()) {
                countOfPlayers++;
            }
        }
        return countOfPlayers;
    }
}

public class AssociationExample{
    public static void main (String[] args) {

        int[] myArray = new int[10];
        System.out.println(myArray.getClass().getName());
        System.out.println(myArray instanceof Object);

        int myArray2[] = new int[15];

        Player p1 = new Player("Harris", 1, "Red");
        Player p2 = new Player("Carol", 2, "Red");
        Player p3 = new Player("Johnny", 1, "Blue");
        Player p4 = new Player("Sarah", 2, "Blue");

        List<Player> blueplayerList = new ArrayList<Player>();
        blueplayerList.add(p1);
        blueplayerList.add(p2);

        List<Player> redPlayerList = new ArrayList<Player>();
        redPlayerList.add(p3);
        redPlayerList.add(p4);

        Team redTeam = new Team("redTeam", redPlayerList);
        Team blueTeam = new Team("blueTeam", blueplayerList);

        List<Team> listOfTeam = new ArrayList<Team>();
        listOfTeam.add(redTeam);
        listOfTeam.add(blueTeam);

        School school = new School("Loyola", listOfTeam);
        System.out.println(school.getTotalPlayersInSchool());



    }
}
