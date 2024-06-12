package Io.codeforall.bootcamp;

public class RangeTest {

    public static void main(String[] args) {



        Range<Integer> r = new Range<>(-5, 5);

        System.out.println("--- USING ITERATOR ---");


        for (Integer i : r) {

            System.out.println("Iterated: " + i);
        }

    }
}
