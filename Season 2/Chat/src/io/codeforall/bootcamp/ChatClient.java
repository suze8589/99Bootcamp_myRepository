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
        //Thread to read messages from the server
        //creates a new thread to handle incoming server messages
        //Thread thread = new Thread(new ChatHandler(inPut));
        //thread.start();

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
        //needs to be a while.....
        try{
            for(int i = 0; i < 3; i++) {
                //sending the request for connection
                //a socket is a end-point
                Socket socket = new Socket("localhost", 8085);
                ChatClient client = new ChatClient(socket);


                Thread clientThread = new Thread(new ChatHandler(client.inPut) );//lambda expression
                clientThread.start();
                client.startConnection();
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }
    //runnable to handle incoming messages from the server!
    //this class represents a task, in the begging of the program the main thread delegates to this thread
    private static class ChatHandler implements Runnable{
        private BufferedReader inPut;

        public ChatHandler(BufferedReader inPut){
            this.inPut = inPut;
        }

        @Override
        public void run() {
            String message;
            //
            try{
            while((message = inPut.readLine()) != null){
                System.out.println("Server: " + message);
            }

        }   catch (IOException e) {
                // I need to close the connection
                //close inPut stream
                //client.closeConnection();
                //socket.close();
                System.out.println("Connection closed.");
            }
        }



    }
}


