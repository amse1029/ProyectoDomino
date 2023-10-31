
package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BrokerThread implements Runnable {
    
    //Sockets de entrada y salida
    private Socket inputSocket;
    private Socket outputSocket;
    
    public BrokerThread(Socket inputSocket, Socket outputSocket){
        this.inputSocket = inputSocket;
        this.outputSocket = outputSocket;
    }

    @Override
    public void run() {
        try{
            //Permite leer datos que llegan desde el cliente
            InputStream in = inputSocket.getInputStream();
            //Permite enviar datos al servidor destino
            OutputStream out = outputSocket.getOutputStream();
            
            //Buffer de bytes
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            //Se ejecuta mientras se puedan leer datos desde el cliente
            //Se leen los datos desde el inputSocket y se almacenan en el buffer
            while((bytesRead = in.read(buffer)) != -1){
                //Se escriben los datos leídos en el outputSocket
                out.write(buffer,0,bytesRead);
                out.flush();
            }
                    
            inputSocket.close();
            outputSocket.close();
                   
                    
        } catch (IOException e) {
            e.printStackTrace();
    }
    
    }
}
