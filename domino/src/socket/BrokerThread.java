
package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BrokerThread implements Runnable {
    
    private Socket inputSocket;
    private Socket outputSocket;
    
    public BrokerThread(Socket inputSocket, Socket outputSocket){
        this.inputSocket = inputSocket;
        this.outputSocket = outputSocket;
    }

    @Override
    public void run() {
        try{
            InputStream in = inputSocket.getInputStream();
            OutputStream out = outputSocket.getOutputStream();
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while((bytesRead = in.read(buffer)) != -1){
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
