import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Game {
    private Rectangle road = new Rectangle(10, 10, 533, 200);

    private Picture picture = new Picture(10, 10, "resources/empty-road.jpeg");

    private Player player = new Player(picture);

    public static final int NUM_CARS = 4;

    /**
     * Container of Cars
     */
    private Car[] cars;

    private int carCreationCounter = 0;
    private int carCreationInterval = 50;
    private int currentCarIndex = 0;

    private int lives = 3;

    public void init() {
        cars = new Car[NUM_CARS];

        picture.draw();
        new Handler(player);
        road.draw();
        player.fill();
        startGameLoop();
    }

    private void startGameLoop() {
        while (lives > 0) {
            if (carCreationCounter % carCreationInterval == 0 && currentCarIndex < NUM_CARS) {
                cars[currentCarIndex] = CarFactory.getNewCar();
                cars[currentCarIndex].fill();
                currentCarIndex++;
            }

            for (int i = 0; i < currentCarIndex; i++) {
                
                if(cars[i] == null)
                    continue;


                if (cars[i].getCarRectangle().getX() == 0) {
                    cars[i].getCarRectangle().delete();
                }
                cars[i].move();

                //checkCollisions(player, cars[i]);
                if(isCollision(player, cars[i])){
                    cars[i].getCarRectangle().delete();
                    cars[i]= null;
                    lives--;
                    System.out.println("You just got hit!");
                    if (lives == 0) {
                        player.setCrashed(true);
                        System.out.println("Game Over!");
                        break;
                    }
                    //continue;
                }

                /*if (lives == 0) {
                    player.setCrashed(true);
                    System.out.println("Game Over!");
                    break;
                }*/
            }
            carCreationCounter++;

            // Add a delay to control the speed of the game loop
            try {
                Thread.sleep(100); // Adjust the delay as needed (in milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void checkCollisions(Player p, Car c) {

        /*if(isCollision(p, c)){
            c.getCarRectangle().delete();
            lives--;
            System.out.println("You just got hit!");
            continue;
        } */

    }

    public boolean isCollision(Player p, Car c) {
        int playerX = p.getPlayerRectangle().getX();
        int playerY = p.getPlayerRectangle().getY();
        int playerWidth = p.getPlayerRectangle().getWidth();
        int playerHeight = p.getPlayerRectangle().getHeight();
        int carX = c.getCarRectangle().getX();
        int carY = c.getCarRectangle().getY();
        int carWidth = c.getCarRectangle().getWidth();
        int carHeight = c.getCarRectangle().getHeight();
        return playerX < carX + carWidth &&
                playerX + playerWidth > carX &&
                playerY < carY + carHeight &&
                playerY + playerHeight > carY;
    }


    


}

