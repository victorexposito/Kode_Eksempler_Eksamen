package DataGram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {

    public static void main(String[] args) throws Exception{

        DatagramSocket ds = new DatagramSocket();
        String str = "Hello Receiver!";
        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dgp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dgp);
        ds.close();
    }
}
