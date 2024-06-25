import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        //Splits the string by whitespace
        String[] words = message.split("\\s+");

        //creates a stream from array of words
        String result = Stream.of(words)
                .filter(word -> !word.contains("garbage"))
                .map(String::toUpperCase)
                .reduce((word1, word2) -> word1 + " " + word2)
                .orElse(" ");



        System.out.println(result);
    }




}