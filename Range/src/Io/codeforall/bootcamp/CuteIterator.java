package Io.codeforall.bootcamp;

import java.util.Iterator;

public class CuteIterator implements Iterator<Integer> {

    private int min;

    private int max;

    public CuteIterator (int min, int max){
        this.min = min;
        this.max = max;

    }

    @Override
    public boolean hasNext(){
        System.out.println("");
        if (min <= max){
           return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        return min++;
    }


}
