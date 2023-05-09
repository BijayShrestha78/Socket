import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("It is open for connection!");
        ServerSocket serverSocket = new ServerSocket(12345);
        serverSocket.accept();
        System.out.println("New Client Connected!");
    }
}