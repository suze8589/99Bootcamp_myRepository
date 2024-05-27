package io.codecadet.bootcamp;

public class SniperRifle {
    private int damage;

    public SniperRifle(int damage) {
        this.damage = damage;
    }

    public void shoot(Enemy enemy) {
        enemy.hit(this.damage);
    }

    public void shoot(ArmouredEnemy armouredEnemy) {
        int hitToArmour = Math.min(armouredEnemy.getArmour(), this.damage);
        armouredEnemy.takeDamage(hitToArmour);
        this.damage -= hitToArmour; // subtract damage to armour
    }

    public void shoot(Tree tree){
        tree.cannotShoot();
    }
}
