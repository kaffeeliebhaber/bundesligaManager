import entity.Player;

public class FootballManager {

    public static void main(String[] args) {

        final Team bvb = new Team("BVB");

        final Player luisSchultz = new Player();

        luisSchultz.setFirstName("Luis");
        luisSchultz.setLastName("Schultz");
        luisSchultz.setAge(19);
        luisSchultz.setDefense(20);
        luisSchultz.setMidTable(22);
        luisSchultz.setAttack(25);

        bvb.addPlayer(luisSchultz);


        final Trainer trainer = new Trainer("Jürgen Klinsmann", 1_000_000);
        trainer.setTeam(bvb);


        

    }

}
