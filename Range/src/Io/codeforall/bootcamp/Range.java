package Io.codeforall.bootcamp;

import java.util.Iterator;

public class Range<T> implements Iterable<Integer>{

    private int min;

    private int max;


    public Range (int min, int max) {
        this.min = min;
        this.max = max;
    }



    @Override
    public Iterator<Integer> iterator(){

        return new CuteIterator(min, max);

    }


}
