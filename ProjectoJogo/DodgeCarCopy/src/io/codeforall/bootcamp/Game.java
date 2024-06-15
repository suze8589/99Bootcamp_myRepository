package io.codeforall.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.omg.PortableServer.POAPackage.WrongAdapter;

import javax.jws.Oneway;

public class Game {

    private Picture pictureGarden = new Picture(10,10,"resources/images/background1.jpg");
    Rectangle road = new Rectangle(10, 10, 533, 200);
    private Picture picture = new Picture(10, pictureGarden.getHeight()+pictureGarden.getY(),"resources/images/road.jpg");
    private Picture playerPicture = new Picture(10,(picture.getY()+picture.getHeight()+10)/2,"resources/images/race car red copy.png");
    private Picture carPicture = new Picture(450,(picture.getY()+ picture.getHeight()/2),"resources/images/blue race car copy.png");

    private Picture pictureGarden2 = new Picture(10, picture.getHeight()+ picture.getY(),"resources/images/background2.jpg");
    private Car car = new Car(carPicture);
    private Player player = new Player(playerPicture);






    //io.codeforall.bootcamp.Car car = new io.codeforall.bootcamp.Car();

    public static final int NUM_CARS = 4;

    /**
     * Container of Cars
     */
    private Car[] cars;

    private int carCreationCounter = 0;
    private int carCreationInterval =50;
    private int currentCarIndex = 0;

    public void init() {
        cars = new Car[NUM_CARS];


        pictureGarden.draw();
        road.draw();
        picture.draw();
        player.fill();
        car.fill();
        pictureGarden2.draw();
        new Handler(player);
        startGameLoop();
    }

    private void startGameLoop() {
        while (true) {
            if(carCreationCounter % carCreationInterval == 0 && currentCarIndex < NUM_CARS) {
                cars[currentCarIndex] = CarFactory.getNewCar(carPicture);
                cars[currentCarIndex].fill();
                currentCarIndex++;
            }

            for (int i = 0; i < currentCarIndex; i++) {
                if(cars[i].getCarRectangle().getX() == 0){
                    cars[i].getCarRectangle().delete();
                }
                cars[i].move();

            }
            carCreationCounter++;

            // Add a delay to control the speed of the game loop
            try {
                Thread.sleep(100); // Adjust the delay as needed (in milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}


