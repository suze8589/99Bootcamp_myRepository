import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {



    public static void main(String[] args) throws IOException {
        int portNumber = 9999;
        ServerSocket serverSocket = new ServerSocket(portNumber);
        System.out.println("caquinha");
        Socket clientSocket = serverSocket.accept();


        System.out.println("caquinha 1");

        PrintWriter outPut = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader inPut = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        inPut.readLine();
        outPut.println(outPut);





         outPut.close();
         inPut.close();
         serverSocket.close();


        System.out.println("Hello world!");
    }
}