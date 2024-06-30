import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n######   POTATOES STORE   #######");
        System.out.println("###########   Welcome   ###########\nPlease follow the instructions below. \n");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Prompt prompt = new Prompt(System.in, System.out);

        //Ask the client if they want potatoes
        Set<String> introOptions = new HashSet<>();
        introOptions.add("yes");
        introOptions.add("no");
        StringInputScanner question1 = new StringSetInputScanner(introOptions);
        question1.setMessage("Do you want to buy potatoes? (yes/no) \n");
        String choosePotatoes = prompt.getUserInput(question1);


        //give options to the client to choose if the answer is yes
        if("yes".equals(choosePotatoes)) {

            //here i set the options
            String[] options = {" Boiled Potatoes\n", " Smashed Potatoes\n", " Stewed Potatoes\n"};
            MenuInputScanner scanner = new MenuInputScanner(options);
            scanner.setMessage("What kind of potatoes do you want? We have these three options:\n");
            int answerIndex = prompt.getUserInput(scanner);

            //display the chosen potato
            String chosenPotato = options[answerIndex - 1];

            System.out.println("\nYou choose wisely: " + chosenPotato);

            //thread sleep to delay
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("#########     Thank you for visiting the Potatoes Store! See you next time!   #########");
            System.exit(0);//exit the program - goodbye

        }

        //Starting login process with a question
        System.out.println("######  Before we process your order, please login.  ######\n");


        //Define the login username options
        //to ask the user it has to match one of these three users if not you can create a new one

        //password: MisterFrodo if it is Sam,
        //password: FrodoBaggins if it is Frodo
        //password: MyPrecious if it is Gollum

        Map<String, String> userLogin = new HashMap<>();
        userLogin.put("Sam", "MisterFrodo");
        userLogin.put("Frodo", "FrodoBaggins");
        userLogin.put("Gollum", "MyPrecious");

        //prompt for username
        StringInputScanner usernameQuestion = new StringInputScanner();
        usernameQuestion.setMessage("Please enter your username: ");
        usernameQuestion.setError("Username not found, please create an account.");
        String username = prompt.getUserInput(usernameQuestion);


        //check if the username is valid
        while(true){
        if(userLogin.containsKey(username)){
            //prompt for password based on username
            StringInputScanner passwordQuestion = new StringInputScanner();
            passwordQuestion.setMessage("\nPlease enter your password:\n");

            String password;

            //loop to validate password

                password = prompt.getUserInput(passwordQuestion);

                //to very if the password is in set of strings --> HashMap
                if(userLogin.get(username).equalsIgnoreCase(password)){
                    System.out.println("Login successful!\n");

                } else {
                    System.out.println("Invalid password. Please try again.\n");
                }
            } else {
            System.out.println("Username not found. You can create a new account.\n");

            }
        }

            //IntegerInputScanner question3 = new IntegerInputScanner();
            //question3.setMessage("Do you want to add more potatoes?");
            //int numberPotatoes = prompt.getUserInput(question3);
            //System.out.println("We will get you these many potatoes:  " + numberPotatoes);




    }
}