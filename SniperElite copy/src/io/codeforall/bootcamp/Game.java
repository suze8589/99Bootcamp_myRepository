package io.codeforall.bootcamp;

import io.codeforall.bootcamp.Enemy.ArmouredEnemy;
import io.codeforall.bootcamp.Enemy.SoldierEnemy;

public class Game {
    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    private int numberGameObjects;


    public Game(GameObject[] gameObjects, SniperRifle sniperRifle, int shotsFired) {
        this.gameObjects = gameObjects;
        this.sniperRifle = sniperRifle;
        this.shotsFired = shotsFired;
        this.numberGameObjects = numberGameObjects.lenght;


    }


    public int getNumberGameObjects() {
        return numberGameObjects;
    }

    //method start game
    public void start() {

        System.out.println("Start shooting!");


            for (int i = 0; i < gameObjects.length; i++) {
                if (gameObjects[i] instanceof ArmouredEnemy) {
                    ArmouredEnemy armouredEnemy = (ArmouredEnemy) gameObjects[i];
                    System.out.println("Armoured enemy:" + armouredEnemy.getArmour());
                    //else for health
                }


                if (gameObjects[i] instanceof SoldierEnemy) {
                    SoldierEnemy soldierEnemy = (SoldierEnemy) gameObjects[i];
                    System.out.println("Soldier enemy:" + soldierEnemy.getHealth());
                }
            }

            //while
            //for
            //if instance of armouredSoldier
            //if instance of enemySoldier
            //WHAT ABOUT THE TREE


        }


        //creatObjects method is an int
        // math.random inside gameObjects[math.random]


    }




