package Rock;

public class Player {
    private String playerName;
    int score = 0;
    GameType play;


    public Player(String pName) {
        this.playerName = pName;
    }
    public String getName(){
        return this.playerName;
    }
    public void playerPlay() {
        GameType a = RandomChoice.randomPlay();
        System.out.println(this.playerName + " you choose:" + a);
        this.play = a;

    }
    public GameType getPlay() {
        return this.play;
    }
    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}

