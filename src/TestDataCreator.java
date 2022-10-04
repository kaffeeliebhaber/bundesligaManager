import entity.Player;

import java.util.List;
import java.util.ArrayList;

public class TestDataCreator {

    public List<Player> createPlayers() {

        List<Player> players = new ArrayList<Player>();

        players.add(Player.create("Max", "Muster", 20, 21, 23, 35));
        players.add(Player.create("Peter", "Pane", 19, 26, 28, 29));
        players.add(Player.create("Lars", "Fox", 23, 28, 31, 17));
        players.add(Player.create("Dede", "Bale", 31, 35, 31, 41));

        return players;
    }

    public List<Team> createTeams() {

        List<Team> teams = new ArrayList<Team>();

        teams.add(new Team("SV Berlin"));
        teams.add(new Team("Hamburger Club"));
        teams.add(new Team("Flensburger SV"));
        teams.add(new Team("Dortmunder Kickers"));

        return teams;
    }

}
