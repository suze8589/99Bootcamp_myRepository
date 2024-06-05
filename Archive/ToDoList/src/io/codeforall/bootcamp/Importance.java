package io.codeforall.bootcamp;

public enum Importance {

    HIGH(1),

    MEDIUM(2),

    LOW(3);

    private int value;

    private Importance(int value){
        this.value = value;
    }

    private int getValue(){
        return this.value;
    }
}
