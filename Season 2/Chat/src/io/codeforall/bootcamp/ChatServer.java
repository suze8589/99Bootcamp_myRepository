package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
 private Socket serverSocket;
 private static PrintWriter out;
 private static BufferedReader in;

 public ChatServer(String serverAddress) throws IOException {
  serverSocket = new Socket(serverAddress, 8085);
  in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
  out = new PrintWriter(serverSocket.getOutputStream(), true);

 }

public static class start implements Runnable {


   @Override
   public void run() {
    try {
     while(true){
      String message = in.readLine();
      if (message.startsWith("")){
       System.out.println("Enter your message: ");
       BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
       String name = userIn.readLine();
       out.println(name);
      }
     }

    } catch (IOException e) {
     throw new RuntimeException(e);
    }
   }
  }
}



