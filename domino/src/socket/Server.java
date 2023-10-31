
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
        //Punto de entrada para aceptar conexiones de clientes en un servidor.
        ServerSocket serverSocket = new ServerSocket(9999);
        
        // Bucle que acepta conexiones de clientes y crea hilos para manejar las conexiones
        while(true){
            //Acepta la conexión del cliente
            Socket clientSocket = serverSocket.accept();
            //Muestra la ip del cliente
            System.out.println("Conexión aceptada por " + clientSocket.getInetAddress());
            
            //Hilo que maneja la comunicación con el cliente
            new Thread(new ServerThread(clientSocket)).start();
        }
        
        } catch (IOException e) {
            System.err.println("Could not listen on port: 5000");
            System.exit(1);
        }
    }
    
}
