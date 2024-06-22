package io.codeforall.bootcamp;

import sun.util.resources.en.TimeZoneNames_en_CA;

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
    private String userInPut;


    public ChatClient(Socket clientSocket) {
        this.clientSocket = clientSocket;
    try {
        PrintWriter outPut = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader inPut = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
    }catch (IOException e){
        e.printStackTrace();
    }

    }

    public static void main(String[] args) {
         try{
             Socket socket = new Socket("localhost", 8085);
             ChatClient client = new ChatClient(socket);
             //Implement chat client logic here
         } catch (IOException e){
             e.printStackTrace();
         }


    }


    public void startConnection(String serverAddress, int severPort) {
        //client envia o pedido
        try {
            clientSocket = new Socket(serverAddress, severPort);
            inPut = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
            outPut = new PrintWriter(clientSocket.getOutputStream(), true);
            systemIn = new BufferedReader(new InputStreamReader(System.in));

            Thread clientThread = new Thread((Runnable) clientSocket);

            clientThread.start();

        } catch (IOException e){
            e.printStackTrace();

        }





    }


}

