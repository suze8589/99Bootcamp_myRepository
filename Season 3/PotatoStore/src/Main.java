import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        String[] options = {"Sam", "Frodo", "Gollum"};

        System.out.println("Welcome to the POTATOS store!!");
        System.out.println("###################################");


        //login to potato store using the username: Sam, Frodo, Gollum
        //password: MisterFrodo,

        //ask the client what kind of potatos they want
        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("What kind of POTATOS do you want?");

        //wrong username
        String answer1 = prompt.getUserInput(question1);
        System.out.println("We don't have that kind of , " + answer1);

         //give options to the client to choose
        //System.out.println("We have these 3 tea options for you: " + teaMenu);


        Set<String> options = new HashSet<>();
        System.out.println("We have these 3 options of POTATOS: " + options);
        options.add("Boil them?");
        options.add("Smash them?");
        options.add("Put them in a stew?");
        StringSetInputScanner question2 = new StringSetInputScanner(options);

        String teaMenu = prompt.getUserInput(question2);
        String chooseTea = prompt.getUserInput(question2);

        //ask the client the number of tea bags
        IntegerInputScanner question3 = new IntegerInputScanner();
        question3.setMessage("How many bags do you want?");
        int numberBags = prompt.getUserInput(question3);
        System.out.println("We will get you: " + chooseTea + " and these many " + numberBags);

    }
}