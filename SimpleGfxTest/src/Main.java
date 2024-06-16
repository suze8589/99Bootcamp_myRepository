import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 10, 600, 600);
        rectangle.draw();

        Picture picture = new Picture(10,10, "resources/img.png");
        picture.draw();

        Player player = new Player(new Ellipse(290,290,50,50));
        player.fill();
        new Handler(player);

        System.out.println("Now we get colors");
    }
}