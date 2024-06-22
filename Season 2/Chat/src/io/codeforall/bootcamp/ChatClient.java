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


    }

    public static void main(String[] args) {



    }


    public void startConnection(String serverAddress, int severPort) {
        //client envia o pedido
        try {
            clientSocket = new Socket(serverAddress, severPort);
        } catch (IOException e){
            e.printStackTrace();

        }



        PrintWriter outPut = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader inPut = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));

        Thread clientThread = new Thread(startConnection("localhost",8085);  





    }


}

