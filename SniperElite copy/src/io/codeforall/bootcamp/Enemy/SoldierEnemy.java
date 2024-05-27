package io.codeforall.bootcamp.Enemy;

public class SoldierEnemy extends Enemy {

    public SoldierEnemy(int health, boolean isDead, String message, int hit) {
        super(health, isDead, "I'm a soldier", hit);
    }


    //hit
    //override message
    @Override
    public String getMessage() {
        return "This is a soldier enemy!";
    }
}
