```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Connected to server. Type messages (exit to quit):");
            while (true) {
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase("exit")) break;
                out.println(message);
                System.out.println("Server: " + in.readLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
```