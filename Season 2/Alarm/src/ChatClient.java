import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;

public class ChatClient {
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    public ChatClient(String serverAddress) throws IOException {
        socket = new Socket(serverAddress, 8085);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void start() throws IOException {
        new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        String message = in.readLine();
                        if (message.startsWith("SUBMITNAME")) {
                            System.out.print("Enter your name: ");
                            BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
                            String name = userIn.readLine();
                            out.println(name);
                        } else if (message.startsWith("NAMEACCEPTED")) {
                            System.out.println("Name accepted. You can start chatting now!");
                        } else if (message.startsWith("MESSAGE")) {
                            System.out.println(message.substring(8));
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }).start();

        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String message = userIn.readLine();
            out.println(message);
        }
    }

    public static void main(String[] args) throws Exception {
        ChatClient client = new ChatClient("localhost");
        client.start();
    }
}