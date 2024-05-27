package io.codeforall.bootcamp;

public class Tree extends GameObject {

    //boolean


    public Tree(String message) {
        super(message);
    }
    @Override
    public String getMessage(){
        return "I'm a tree do not shoot me!";
    }

}
