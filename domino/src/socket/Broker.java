
package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Broker {

    public static void main(String[] args) {

        try {
            int puerto = 5000;
            ServerSocket brockerSocket = new ServerSocket(puerto);
            
            while(true){
                Socket clientSocket = brockerSocket.accept();
                System.out.println("Conexión aceptada por " + clientSocket.getInetAddress());
                
                Socket serverSocket = new Socket("localhost",9999);
                
                new Thread(new BrokerThread(clientSocket, clientSocket)).start();
                new Thread(new BrokerThread(clientSocket, clientSocket)).start();
            }

        } catch (IOException e) {
            System.err.println("Could not listen on port: 5000");
            System.exit(1);
        }
    }

}
