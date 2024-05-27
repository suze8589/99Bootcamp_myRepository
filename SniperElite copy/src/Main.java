import io.codeforall.bootcamp.Enemy.ArmouredEnemy;
import io.codeforall.bootcamp.Enemy.SoldierEnemy;
import io.codeforall.bootcamp.Game;
import io.codeforall.bootcamp.GameObject;
import io.codeforall.bootcamp.SniperRifle;
import io.codeforall.bootcamp.Tree;

public class Main {
    public static void main(String[] args) {


        //Game game = new GameObject();
        GameObject[] gameObjects = new GameObject[3];
        gameObjects[0] = new SoldierEnemy(10, false, "I'm a Soldier Enemy", 10);
        gameObjects[1] = new ArmouredEnemy(10, false, "I'm a Armoured Soldier", 10, 10);
        gameObjects[2] = new Tree("I'm a tree don't shoot me!");

        //create a sniperRifle instance
        SniperRifle sniperRifle = new SniperRifle(10);

        //shots fired
        int shotsFired = 5;

        Game game = new Game(gameObjects,sniperRifle , 100);

        //initialize game
        game.start();
        System.out.println("Help!I'm shot");
    }
}