package io.codecadet.bootcamp;

public  class Enemy extends GameObject {
    private int health;
    private boolean isDead;

    //enemy class extends from gameobject and adds a health field, an isdead field, and three methods: checkHealth,
    //hit() and a constructor

    public Enemy(String message, int health) {
        super(message);
        this.health = health;
        this.isDead = false;
    }

    public boolean checkHealth() {
        if (health < 0) {
            isDead = true;
        }
        return isDead;
    }

     public void hit(int damage){
        health -= damage;
        if(health < 0) {
            isDead = true;
        }
     }

    public void takeDamage(int hitToArmour) {
    }
}
