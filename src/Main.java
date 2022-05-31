public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Thread firstTeam = new Thread(new Team("Real", game));
        Thread secondTeam = new Thread(new Team("Bars", game));
        firstTeam.start();
        secondTeam.start();
    }
}
