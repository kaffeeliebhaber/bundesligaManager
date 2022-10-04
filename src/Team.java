
import entity.Player;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;

public class Team {

    private String teamName;
    private BufferedImage logo;
    private List<Player> players;


    public Team(final String teamName) {
        setTeamName(teamName);
        players = new ArrayList<Player>();
    }

    public void setTeamName(final String teamName) {
        this.teamName = teamName;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(final Player player) {
        players.add(player);
    }
}
