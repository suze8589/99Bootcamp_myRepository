import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Player {
    private Ellipse player;

    public Player(Ellipse player){
        this.player = player;
    }

    public void fill(){
        player.fill();
    }

    public void moveRight()  {
        player.translate( 10, 0);
    }

    public void moveLeft() {
        player.translate(-10,0);
    }
}
