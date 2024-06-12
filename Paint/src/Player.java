
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.crypto.spec.DESKeySpec;

public class Player {
    private Rectangle player;
    private int gridCols;
    private int gridRows;
    private int cellSize;

    public Player(Rectangle player, int gridCols, int gridRows, int cellSize) {
        this.player = player;
        this.gridCols = gridCols;
        this.gridRows = gridRows;
        this.cellSize = cellSize;
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

    public boolean borderWall(Direction direction) {
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

    }
}


