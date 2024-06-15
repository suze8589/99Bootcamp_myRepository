import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    static InetAddress inetAddress;
    




    public static void main(String[] args) throws UnknownHostException {

        Scanner scanner = new Scanner(System.in);
        String line; // We create this String to use it later, to store the input of the user;


        System.out.println("Choose your site:");
        line = scanner.nextLine(); // This method reads and stores the input of the user.


        InetAddress inetAddress1 = InetAddress.getByName(line); // We use the object line that has transformed the user input into a String.
        System.out.println(inetAddress1);





        System.out.println("YA");
    }
}