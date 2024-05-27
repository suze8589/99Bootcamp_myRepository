package io.codecadet.bootcamp;

public abstract class GameObject {
    private String message;

    public GameObject(String message){
        this.message = message;
    }

    public void printMessage(String message){
        System.out.println(this.message);
    }
}

