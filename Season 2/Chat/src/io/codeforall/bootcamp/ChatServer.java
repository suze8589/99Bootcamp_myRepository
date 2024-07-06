package io.codeforall.bootcamp;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.err;
import static java.lang.System.out;

//

public class ChatServer {
 //needs a list:
 private static final int PORT = 8085;
 private ServerSocket serverSocket;
 private List<ServerWorker> workers = Collections.synchronizedList( new ArrayList<ServerWorker>());

 public ChatServer() throws IOException {
  //needs a port
  serverSocket = new ServerSocket(PORT);


 }


    //they don't use runnable here
    //first serverSocket(port)
    //inside a while true
    //Block waiting for client connections
    //Socket clientSocket = serverSocket.accept();
    //sout "client accepted: " + clientSocket
    public void start() {

        out.println("Chat server started on port " + PORT);
        while(true){
            try {
                Socket clientSocket = serverSocket.accept();
                out.println("Client connected: " + clientSocket);
                ServerWorker worker = new ServerWorker(this, clientSocket);//instantiation of the variable worker
                workers.add(worker);
                new Thread(worker).start(); //starts a new thread

            } catch (IOException e){
                out.println("Error accepting client connection" + e.getMessage());
         }
     }
 }

  //inside a while true
  //Block waiting for client connections
  //Socket clientSocket = serverSocket.accept();
  //sout "client accepted: " + clientSocket

 //Create a new Server Worker
 //creates a specific thread to each client
 //to give a name to the client (String)



 //Serve the client connection with a new Thread



 //broadcast a message to all server connected clients

    public void broadcast(String message, ServerWorker sender) {
     for(ChatServer.ServerWorker worker : workers){
         if(worker != sender) {
             worker.sendMessage(message);
         }
    }
 }
 //class ServerWorker handles the connection and implements runnable
 // bufferedReader and bufferedWriter

    class ServerWorker implements Runnable {
        private ChatServer server;
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;


    public ServerWorker(ChatServer server, Socket clientSocket) {
        this.server = server;
        this.clientSocket = clientSocket;
        try {
            this.out = new PrintWriter(clientSocket.getOutputStream(), true);
            this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        String message;
        try {
            while ((message = in.readLine()) != null) {
                System.out.println("Message send to client: " + message);
                server.broadcast(message, this);

                BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
                String userName = systemIn.readLine();
                System.out.println(userName);
                client.outPut.println("username: " + userName);//send the username to the server//needs to be in the server not the client!!!
            }
        } catch (IOException e) {
            out.println("Error handling client connection: " + e.getMessage());
        } finally {
        server.workers.remove(this);//
    }   try{
            clientSocket.close();
        } catch (IOException e){
            e.printStackTrace();
         }

        } public void sendMessage(String message){
            out.println(message);
    }
}


    public static void main(String[] args) {
        try{
            ChatServer server = new ChatServer();
            server.start();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}



