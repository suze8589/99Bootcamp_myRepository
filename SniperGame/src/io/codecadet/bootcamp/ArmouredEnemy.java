package io.codecadet.bootcamp;

public class ArmouredEnemy extends Enemy {
    private int armour;
    public ArmouredEnemy(String message, int health, int armour) {
        super(message, health);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }



    // use the hit method to decrease armor
    public void hit(int damage) {

        if (armour > 0) {

            armour -= damage;

            if (armour < 0) {

                armour = 0;

            }

        } else {

            super.hit(damage);

        }

    }
}
