package io.codeforall.bootcamp.Enemy;

import io.codeforall.bootcamp.GameObject;
import sun.awt.X11.XSystemTrayPeer;

public abstract class Enemy extends GameObject {
    private static String message;
    private int health;
    private boolean isDead;



    public Enemy(int health, boolean isDead, String message, int hit) {
        super(message);
        this.health = health;
        this.isDead = isDead;
        this.message = message;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        checkIfDead();
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        this.isDead = isDead;
    }




    //hit method - int
    public void hit(int damage){
        if (!isDead){
            setHealth(getHealth() - damage);
            System.out.println("Enemy hit for" + damage + "damage!");
        } else {
            System.out.println("Enemy is already dead!");
        }

    }
    
    private void checkIfDead(){
        if (health <= 0){
            isDead = true;
            health = 0;
        }
    }

    //isDead method - boolean


    //getMessage method - sting
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}



