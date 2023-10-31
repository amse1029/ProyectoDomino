
package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class ServerThread implements Runnable{
    //Representa el socket que se comunica con el cliente
    private Socket clientSocket;
    
    public ServerThread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        
        try{
            //Flujos de entrada y salida
            InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();
            
            byte[] buffer = new byte[1024];
            int bytesRead;

            //Se ejecuta mientras se puedan leer datos desde el cliente
            //Se leen los datos desde el clientSocket y se almacenan en el buffer
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                out.flush();
            }

            clientSocket.close();
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
    }
    }
}
