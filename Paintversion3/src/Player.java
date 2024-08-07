
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * this is a comment :)
 * this class player represents a player in the grid
 * the player can move around and interact with the grid by painting or erasing the cells.
 */
public class Player {
    private final Rectangle player;
    private final Grid grid;//the constructor needs to now the grid to reference grid boundaries.
    private boolean isPainting = true;
    //private boolean painted;

    /**
     * Constructs a Player instance.
     *
     * @param player The Rectangle object representing the player.
     * @param grid The Grid object which the player interacts with.
     */

    public Player(Rectangle player, Grid grid) {
        this.player = player;
        this.grid = grid;
        //this.painted = true;
    }



    public void fill() {
        player.setColor(Color.GREEN);
        player.fill();
    }

    public void moveRight() {
        //player.getX gets the current position of the player in the grid;
        //grid.getCellSize Used to determine how far the player should move. Each move corresponds to the size of one cell, which is 30 pixels.
        //grid.getWidth Used to check if the new x-coordinate of the player (current x + cell size) would be within the grid's width.
        if (player.getX() + grid.getCellSize() < grid.getWidth()){
            player.translate(grid.getCellSize(), 0);
         }
    }

    public void moveLeft() {
        // >=  is the greater-than-or-equal operator.
        //This checks if the new x-coordinate is greater
        // than or equal to 10. The value 10 is used because the grid starts at the x-coordinate of 10,
        // so we need to ensure that the player does not move out of the grid's left boundary.
        if (player.getX() - grid.getCellSize() >= 10) {
            player.translate(-grid.getCellSize(), 0);
        }
    }

    public void moveUp() {
        if (player.getY() - grid.getCellSize() >= 10){
            player.translate(0,-grid.getCellSize());
        }
    }

    public void moveDown() {
        if (player.getY() + grid.getCellSize() < grid.getHeight()) {
            player.translate(0, 30);
        }
    }

    /**
     * Toggle between painting and erasing
     */
    public void toggleMode(){
        isPainting = !isPainting;
    }

    public void paintCell(){
        int col = (player.getX() - 10) / grid.getCellSize();
        int row = (player.getY() - 10) / grid.getCellSize();
        grid.paint(col,row);
    }
    public int getX() {
        return player.getX();
    }

    public int getY() {
        return player.getY();
    }


    /*public int getX() {
        return grid.getRows();
    }

    public int getY() {
        return grid.getCols();
    }*/
}


