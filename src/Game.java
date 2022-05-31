public class Game {
    private int ballCount = 0;
    private int yellowCards = 0;
    private int offsideCount = 0;

    // Getters, Setters, Constructors

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getOffsideCount() {
        return offsideCount;
    }

    public void setOffsideCount(int offsideCount) {
        this.offsideCount = offsideCount;
    }

    public String toString( String name) {
        return "Game{" +
                "\nTeam-name "+ name +
                "\nballCount = " + ballCount +
                "\nyellowCards = " + yellowCards +
                "\noffsideCount = " + offsideCount;
    }
}
