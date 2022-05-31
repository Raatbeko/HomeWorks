import java.util.Random;

public class Team extends Thread {

    private String name;
    private Game game;

    public Team(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    @Override
    public void run(){
        game.setBallCount(new Random().nextInt(15));
        game.setOffsideCount(new Random().nextInt(15));
        game.setYellowCards(new Random().nextInt(15));
        System.out.println(game.toString(name));
    }


    public String getNam() {
        return name;
    }

    public void setNam(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
