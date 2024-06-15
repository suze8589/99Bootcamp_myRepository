import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        Range rForward = new Range(-5, 5, Range.Direction.FORWARD);
        Range rReverse = new Range(-5, 5, Range.Direction.REVERSE);




        System.out.println("--- USING ITERATOR ---");
        for (Integer i : rForward){
            System.out.println(i + "");
        }

        System.out.println();

        System.out.println("--- USING ITERATOR ---");
        for (Integer i : rReverse) {
            System.out.println(i + "");
        }
        System.out.println();

    }

}





