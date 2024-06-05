package io.bootcamp.codeforall;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;

import java.util.Iterator;
import java.util.Set;

public class UniqueWord  implements Iterable<UniqueWord> {

    //private String word;
    private Set set;


    public UniqueWord( Set set) {
        //this.word = word;
        this.set = set;


    }



    @Override
    public Iterator<UniqueWord> iterator() {
        return null;
    }


}
