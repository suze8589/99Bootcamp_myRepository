
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Main {
    public static void main(String[] args) {

        Grid grid = new Grid(600,600);
        grid.init();

        Player player = new Player(new Rectangle(10, 10, grid.getCellSize(), grid.getCellSize()), grid);
        player.fill(); //initializes th rectangle player

        new Handler(player, grid);

       //System.out.println("Hello");

    }
}