package io.codeforall.bootcamp;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

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
        System.out.println("Chat server started on port" + PORT);
        while(true){
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);
                workers.add(worker);
                new Thread(worker).start();

            } catch (IOException e){
                System.out.println("Error accepting client connection" + e.getMessage());
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
     for(ServerSocket worker : workers){
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

 

 public ServerWorker(ChatServer server, Socket clientSocket){
  this.server = server;
  this.clientSocket = clientSocket;
  try {
   this.out = new PrintWriter(clientSocket.getOutputStream(), true);
   this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  } catch (IOException e){
   e.printStackTrace();
  }
 }


   @Override
   public void run() {


       String message;
       try {
           while ((message = in.readLine()) != null) {

               System.out.println("Message received: " + message);
               server.broadcast(message, this);
           }
       } catch (IOException e) {
           throw new RuntimeException(e);

       }
   }




