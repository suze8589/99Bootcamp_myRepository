package io.codeforall.bootcamp.Enemy;

public class ArmouredEnemy extends Enemy {

    private int armour;


    public ArmouredEnemy(int health, boolean isDead, String message, int hit, int armour) {
        super(health, isDead, "I'm an armoured soldier", hit);
        this.armour = armour;

    }

    public int getArmour(){
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;

    }

    //hit(int damage)

    //override message
    @Override
    public String getMessage() {
        return "I'm a Armoured Soldier";
    }

    //armour method

    public void hit(int damage){

    }
}
