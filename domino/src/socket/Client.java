
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String brokerAddress = "localhost";
        int brokerPort = 5000;
        
        try(Socket brokerSocket = new Socket(brokerAddress, brokerPort)){
        System.out.println("Conectado al Broker en " + brokerAddress + ":" + brokerPort);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = brokerSocket.getOutputStream();
        InputStream in = brokerSocket.getInputStream();
        
         byte[] buffer = new byte[1024];
         int bytesRead;
         
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
