package entity;

public class Player {

    private String firstName; // Vorname
    private String lastName; // Nachname
    private int attack; // Angriff
    private int defense; // Verteidigung
    private int midTable; // Mittelfeld
    private int age; // Alter
    private int marketValue; // Aktueller Verkaufswert
    private int salery; // Gehlt
    private int contractDuration; // Laufzeit des Vertrags

    private boolean onAFree; // Nächste Saison ablösefrei
    private boolean onField;
    //private PlayerStatistic statistic; // Spielerstatisik.

    public static Player create(String firstName, String lastName, int age, int defense, int midTable, int attack) {

        final Player player = new Player();

        player.setFirstName(firstName);
        player.setLastName(lastName);
        player.setAge(age);
        player.setAttack(attack);
        player.setMidTable(midTable);
        player.setDefense(defense);

        return player;
    }

    /*
    public int schiesstAufTor(){
        Random r = new Random();
        // Entfernungspauschale :)
        torschuss = Math.max(1, Math.min(10, torschuss - r.nextInt(3)));

        // +-1 ist hier die Varianz
        int ret = Math.max(1, Math.min(10, torschuss + r.nextInt(3)-1));

        return ret;
    }
    */


    public void setFirstName(final String firstName) { this.firstName = firstName; }
    public void setLastName(final String lastName) { this.lastName = lastName; }
    public void setAge(final int age) { this.age = age; }
    public void setAttack(final int attack) { this.attack = attack; }
    public void setDefense(final int defense) { this.defense = defense; }
    public void setMidTable(final int midTable) { this.midTable = midTable; }

}
