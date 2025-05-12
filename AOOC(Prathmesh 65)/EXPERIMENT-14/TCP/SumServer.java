import java.io.*;
import java.net.*;

public class SumServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1235);
        Socket socket = serverSocket.accept();

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        int num1 = dis.readInt();
        int num2 = dis.readInt();

        int sum = num1 + num2;
        dos.writeInt(sum);

        socket.close();
        serverSocket.close();
    }
}

