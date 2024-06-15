import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Rectangle playerRectangle;

    private Picture picture;

    private boolean isCrashed;

    public Player(Picture picture) {
        this.picture = picture;
        playerRectangle = new Rectangle(15, 60, 80, 40);
    }


    public void fill() {
        playerRectangle.fill();
    }

    public void moveRight() {
        if((playerRectangle.getX() + playerRectangle.getWidth() + 10) <= (picture.getX() + picture.getWidth()) && !isCrashed)
            playerRectangle.translate(10,0);
    }


    public void moveLeft() {
        if((playerRectangle.getX() - 10) >= picture.getX() && !isCrashed)
            playerRectangle.translate(-10, 0);
    }


    public void moveUp() {
        if(playerRectangle.getY() - 10 >= picture.getY() && !isCrashed)
            playerRectangle.translate(0, -10);
    }


    public void moveDown() {
        if((playerRectangle.getY() + playerRectangle.getHeight() + 10) <= (picture.getY()) + picture.getHeight() && !isCrashed)
            playerRectangle.translate(0, 10);
    }

    public Rectangle getPlayerRectangle(){
        return playerRectangle;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean isCrashed){
        this.isCrashed = isCrashed;
    }



}
