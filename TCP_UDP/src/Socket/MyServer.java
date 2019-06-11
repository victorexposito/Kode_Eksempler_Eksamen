package Socket;

import java.io.*;
import java.net.*;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String string = dis.readUTF();
            System.out.println("Message = " + string);
            ss.close();

        } catch (Exception e){
            System.out.println("Error");
        }

    }

}
