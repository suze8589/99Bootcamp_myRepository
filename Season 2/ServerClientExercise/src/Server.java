import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class Server {




    public static void main(String[] args) throws IOException {

        String hostComputer = ("127.0.0.1");//127.0.0.1



        byte[] sendBuffer = new byte[1024];
        byte[] receiveBuffer = new byte[1024];


        DatagramSocket socket = new DatagramSocket(9799);

        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        System.out.println("Caquinha 1");
        //socket.close();
        socket.receive(receivePacket);//blocks the program until it receives

        System.out.println("You have a packet");

        //String to convert the message




        // Send Packet
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(hostComputer),9899);
        System.out.println("Caquinha 2");
        socket.send(sendPacket);


        System.out.println("Caquinha 3");


        socket.close();



        System.out.println("Caquinha 4");
    }
}