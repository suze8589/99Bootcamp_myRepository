package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    private Socket clientSocket; //love you Zeca <3
    private BufferedReader inPut;
    private BufferedReader systemIn;
    private PrintWriter outPut;


    public ChatClient(Socket clientSocket) {
        this.clientSocket = clientSocket;
    try {
        this.outPut = new PrintWriter(clientSocket.getOutputStream(),true);
        this.inPut = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        this.systemIn = new BufferedReader(new InputStreamReader(System.in));

    } catch (IOException e){
        e.printStackTrace();
    }

    }



    public void startConnection() {
        //Thread to read messages from the server

            Thread serverThread = new Thread(new ServerHandler(inPut));
            serverThread.start();

        //Main thread to handle user input
        String userInPut;
        try{
            while((userInPut = systemIn.readLine()) != null){
                outPut.println(userInPut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        //Implement chat client logic here
        try{
            for(int i = 0; i < 3; i++) {
                Socket socket = new Socket("localhost", 8085);
                ChatClient client = new ChatClient(socket);
                Thread clientThread = new Thread(() -> client.startConnection());//lambda expression
                clientThread.start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }

    private static class ServerHandler implements Runnable{
        private BufferedReader inPut;

        public ServerHandler(BufferedReader inPut){
            this.inPut = inPut;
        }

        @Override
        public void run() {
            String message;
            try{
            while((message = inPut.readLine()) != null){
                System.out.println("Server: " + message);
            }
        }catch (IOException e) {
                //do I need to close the connection?
                //client.closeConnection();
                System.out.println("Connection closed.");
            }
        }



    }
}


