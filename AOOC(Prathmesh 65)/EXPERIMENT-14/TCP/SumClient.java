import java.io.*;
import java.net.*;

public class SumClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1235);

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        dos.writeInt(20);
        dos.writeInt(30);

        int result = dis.readInt();
        System.out.println("Sum = " + result);

        socket.close();
    }
}

