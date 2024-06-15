import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {

    private int start;
    private int end;
    private Direction direction;


    //private boolean[] removed;

    public enum Direction {
        FORWARD,
        REVERSE
    }

    public Range(int start, int end, Direction direction) {
        this.start = start;
        this.end = end;
        this.direction = direction;


    }

    @Override
    public Iterator<Integer> iterator() {

        switch (direction){
            case FORWARD:

            return new Iterator<Integer>(){
            private int current = start;

            @Override
            public boolean hasNext(){
            return current < end;
            }

            @Override
            public Integer next(){
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                return current ++;

            }

        };
            case REVERSE:

             return new Iterator<Integer>() {
                 private int current = end;

                 @Override
                 public boolean hasNext() {
                 return current > start;
                 }

                 @Override
                 public Integer next() {
                     if (!hasNext()){
                         throw new NoSuchElementException();
                     }
                     return current --;

                 }
             };

            default:
                throw new AssertionError("Invalid direction!!");
      }



        }



}

