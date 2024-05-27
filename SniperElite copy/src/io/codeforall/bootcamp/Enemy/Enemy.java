package io.codeforall.bootcamp.Enemy;

import io.codeforall.bootcamp.GameObject;

public abstract class Enemy extends GameObject {
    private static String message = "Hello!";
    private int health;
    private boolean isDead;

    //abstract class
    private int hit;


    public Enemy(int health, boolean isDead, String message, int hit) {
        super(message);
        this.health = health;
        this.isDead = isDead;
        this.hit = hit;
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


    public int getHit(int effectiveDamage){
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    //hit method - int
    public void hit(int damage){
        if (!isDead){
            health -= damage;
            checkIfDead();
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



