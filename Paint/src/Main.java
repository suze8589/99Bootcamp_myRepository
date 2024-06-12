import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        Grid grid = new Grid(600,600);
        grid.init();



       Player player = new Player(new Rectangle(10, 10, 30, 30));
       player.fill();



        new Handler(player, grid);

        System.out.println("Hello");

    }
}