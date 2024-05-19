package Rock;

public class RockPaperScissor {
    public static void main(String[] args) {
        Player playerName1 = new Player("Zé");
        Player playerName2 = new Player("Susana");

        System.out.println("Welcome to the game of Rock, Paper, Scissors! Good luck." + "\n");

        while(playerName1.getScore() < 2 && playerName2.getScore() < 2) {
            playerName1.playerPlay();
            playerName2.playerPlay();
            while(playerName1.getPlay()==playerName2.getPlay()) {
                System.out.println("Draw.");
                playerName1.playerPlay();
                playerName2.playerPlay();
            }
            if (playerName1.getPlay() == GameType.ROCK && playerName2.getPlay() == GameType.SCISSOR) {
                System.out.println(playerName1.getName()+" you won!");
                playerName1.setScore(playerName1.getScore()+1);
                continue;
            }
            if (playerName1.getPlay() == GameType.SCISSOR && playerName2.getPlay() == GameType.PAPER) {
                System.out.println(playerName1.getName()+" you won!");
                playerName1.setScore(playerName1.getScore() + 1);
                continue;
            }
            if (playerName1.getPlay() == GameType.PAPER && playerName2.getPlay() == GameType.ROCK) {
                System.out.println(playerName1.getName()+" you won!");
                playerName1.setScore(playerName1.getScore() + 1);
                continue;
            }
            System.out.println(playerName2.getName()+" you won!");
            playerName2.setScore(playerName2.getScore() + 1);
        }
        if(playerName1.getScore() == 2) {
            System.out.println(playerName1.getName()+" you won the Game! "+ playerName1.getScore()+"-"+playerName2.getScore());
        }
        else{
            System.out.println(playerName2.getName()+" you won the Game! "+ playerName1.getScore()+"-"+playerName2.getScore());
        }




    }
}

