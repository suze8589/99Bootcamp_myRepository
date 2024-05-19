package Rock;

public class RandomChoice {


    public static GameType randomPlay() {

        int play = (int) Math.floor(Math.random() * 2);
        if(play == 0){
            return GameType.ROCK;
        }
        if(play == 1){
            return GameType.PAPER;
        }
        return GameType.SCISSOR;

    }

}