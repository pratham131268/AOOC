import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = input.readLine()) != null) {
            System.out.println("Client: " + line);
            System.out.print("You: ");
            String response = keyboard.readLine();
            output.println(response);
        }

        socket.close();
        serverSocket.close();
    }
}

