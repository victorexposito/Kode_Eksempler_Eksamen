package DataGram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buff = new byte[1024];
        DatagramPacket dgp = new DatagramPacket(buff, 1024);
        ds.receive(dgp);
        String str = new String (dgp.getData(), 0, dgp.getLength());

        System.out.println(str);
        ds.close();


    }
}
