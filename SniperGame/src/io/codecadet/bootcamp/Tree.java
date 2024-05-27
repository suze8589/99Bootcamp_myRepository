package io.codecadet.bootcamp;

public class Tree  extends GameObject{
    public Tree(String message) {
        super(message);
    }

    //the tree class also extends fom gameObject and adds a cannotShoot() method to print a message when the player tries to shoot a tree.

    public void cannotShoot() {
        System.out.println("You cannot shoot a tree!");
    }
}
