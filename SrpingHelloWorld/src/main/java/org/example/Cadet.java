package org.example;

public class Cadet {

    private String name;

    public Cadet(String name){
        this.name = name;
    }

    public Cadet(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  sayHello(){
        System.out.println(name + "says hello");
    }
}
