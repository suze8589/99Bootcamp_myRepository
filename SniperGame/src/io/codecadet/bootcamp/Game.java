package io.codecadet.bootcamp;

public class Game {
    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game() {
        //initialize game objects array
        gameObjects = new GameObject[10]; //
        sniperRifle = new SniperRifle(10);
        shotsFired = 0;


    }
    //this creates the gameObjects by
    // i loop counter

    public void createObjects(int numberObjects) {
        for (int i = 0; i < numberObjects; i++) {
            GameObject gameObject;
            if (i % 3 == 0) {
                gameObject = new ArmouredEnemy("Armoured Enemy", 50, 50);
            } else if (i % 2 == 0) {
                gameObject = new SoldierEnemy("Soldier Enemy", 50);
            } else {
                gameObject = new Tree("I'm a tree");
            }
            gameObjects[i] = gameObject;
        }
    }

    public void shoot(SniperRifle sniperRifle, GameObject gameObject) {

        sniperRifle.shoot(gameObject);

    }

    public void start() {
        //implement start method logic here
        createObjects(3);

    }


}
