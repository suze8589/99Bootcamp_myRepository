
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {
    private final Rectangle player;
    //private int cellSize;

    public Player(Rectangle player) {
        this.player = player;
        this.player.setColor(Color.GREEN);//I don't understand why here?
    }



    public void fill() {
        player.fill();
    }

    public void moveRight() {
        //if (player.getCols)
        player.translate(30, 0);
    }

    public void moveLeft() {
        //if
        player.translate(-30, 0);
    }

    public void moveUp() {
        //if
        player.translate(0,-30);
    }

    public void moveDown() {
        //if
        player.translate(0,30);
    }

    public enum Direction{
        RIGHT,
        LEFT,
        UP,
        DOWN
    }

    /*public boolean borderWall(Direction direction) {
        int x = player.getX();
        int y = player.getY();


        switch (direction) {
            case RIGHT:
                if (getPos().getCol() == grid.getCols() - 1) {
                    return true;
                }
                break;
            case LEFT:
                if (getPos().getCol() == 0) {
                    return true;
                }
                break;
            case UP:
                if (getPos().getRow() == 0) {
                    return true;
                }
                break;
            case DOWN:
                if (getPos().getRow() == grid.getRows() - 1) {
                    return true;
                }
        }

        return false;

    }*/
}


