
package MVP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Socket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         String brokerAddress = "localhost";
        int brokerPort = 5000;
        
        //Se establece una conexión con el servidor intermediario
        try(java.net.Socket brokerSocket = new java.net.Socket(brokerAddress, brokerPort)){
        System.out.println("Conectado al Broker en " + brokerAddress + ":" + brokerPort);
        
        //Flujos de entrada y salida para comunicarse con el servidor intermediario
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = brokerSocket.getOutputStream();
        InputStream in = brokerSocket.getInputStream();
        
         byte[] buffer = new byte[1024];
         int bytesRead;
         
         //Permite al cliente enviar y recibir mensajes
         while(true){
             System.out.println("Ingresa un mensaje: ");
             String mensaje = reader.readLine();
             
             out.write(mensaje.getBytes());
             out.flush();
             
             bytesRead = in.read(buffer);
             System.out.println("Recibido del servidor: " + new String(buffer, 0, bytesRead));
         }
            
        }
    }
    
}
