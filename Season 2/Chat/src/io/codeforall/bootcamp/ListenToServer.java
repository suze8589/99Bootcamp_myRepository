package io.codeforall.bootcamp;

import java.io.BufferedReader;


public class ListenToServer implements Runnable{
 private BufferedReader in;


 public ListenToServer(BufferedReader in){
     this.in = in;
 }

    @Override
    public void run() {

    }
}
