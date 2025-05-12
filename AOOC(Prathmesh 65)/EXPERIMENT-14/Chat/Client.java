import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (true) {
            System.out.print("You: ");
            String message = keyboard.readLine();
            output.println(message);
            line = input.readLine();
            System.out.println("Server: " + line);
        }
    }
}

