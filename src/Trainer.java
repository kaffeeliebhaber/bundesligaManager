
import java.awt.image.BufferedImage;

public class Trainer {

    private String name;
    private Team team;
    private int money;
    private BufferedImage logo; // Persönliches Logo

    public Trainer(final String name, final int money) {
        this.name = name;
        this.money = money;
    }

    public void setLogo(final BufferedImage logo) {
        this.logo = logo;
    }

    public void setTeam(final Team team) {
        this.team = team;
    }

}
