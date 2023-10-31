
package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
        int puerto = 9999;
        ServerSocket serverSocket = new ServerSocket(9999);
        
        while(true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("Conexión aceptada por " + clientSocket.getInetAddress());
            
            new Thread(new ServerThread(clientSocket)).start();
        }
        
        } catch (IOException e) {
            System.err.println("Could not listen on port: 5000");
            System.exit(1);
        }
    }
    
}
