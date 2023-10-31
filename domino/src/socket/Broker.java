
package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Broker {

    public static void main(String[] args) {

        try {
            int puerto = 5000;
            ServerSocket brockerSocket = new ServerSocket(puerto);
            
            // Bucle que acepta conexiones de clientes y crea hilos para manejar las conexiones
            while(true){
                
                //Acepta la conexión del cliente
                Socket clientSocket = brockerSocket.accept();
                //Muestra la ip del cliente
                System.out.println("Conexión aceptada por " + clientSocket.getInetAddress());
                //Conecta al servidor del localhost
                Socket serverSocket = new Socket("localhost",9999);
                
                //Hilos que manejan la comunicación entre el cliente y el servidor
                new Thread(new BrokerThread(clientSocket, serverSocket)).start();
                new Thread(new BrokerThread(serverSocket, clientSocket)).start();
            }

        } catch (IOException e) {
            System.err.println("Could not listen on port: 5000");
            System.exit(1);
        }
    }

}
