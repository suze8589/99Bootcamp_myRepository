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


    //starts
    public void startConnection() {

        String userInPut;
        try{
            while((userInPut = systemIn.readLine()) != null){
                System.out.println("Client: ");
                outPut.println(userInPut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void closeConnection(){
        try{
            inPut.close();
            outPut.close();
            clientSocket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //Implement chat client logic here
        //needs to be a while.....
        boolean isConnected = true;
        while(isConnected) {
            try {

                //sending the request for connection
                //a socket is a end-point
                Socket socket = new Socket("localhost", 8085);
                ChatClient client = new ChatClient(socket);
                //client.outPut.println("username: " + userName);//send the username to the server//needs to be in the server not the client!!!
                Thread clientThread = new Thread(new ChatHandler(client.inPut, client));
                clientThread.start();
                client.startConnection();

                //prompt the user for their name

                System.out.println("Enter your name: ");
                BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
                String userName = systemIn.readLine();
                System.out.println("You are now chatting as " + userName);

            } catch (IOException e) {
                e.printStackTrace();
                isConnected = false;
            }
        }

    }
    //runnable to handle incoming messages from the server!
    //this class represents a task, in the begging of the program the main thread delegates to this thread
    private static class ChatHandler implements Runnable{
        private BufferedReader inPut;
        private ChatClient client;

        public ChatHandler(BufferedReader inPut, ChatClient client){
            this.inPut = inPut;
            this.client = client;
        }

        @Override
        public void run() {
            String message;
            //
            try{
            while((message = inPut.readLine()) != null){
                System.out.println("Client: " + message);
            }

        }   catch (IOException e) {
                // I need to close the connection
                //close inPut stream
                client.closeConnection();
                System.out.println("Connection closed.");
            }
        }



    }
}


