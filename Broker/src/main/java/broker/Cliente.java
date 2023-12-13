/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Observable;

/**
 *
 * @author alexa
 */
public class Cliente extends Observable implements Runnable {

    private Socket clientSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private Broker broker;
    private int puerto;

    public void unirsePartida(Partida partida) throws Exception {
        // Crea un objeto Socket
        clientSocket = new Socket(("localhost"), 8081);

        // Obtiene un objeto ObjectInputStream para leer los datos del servidor
        in = new ObjectInputStream(clientSocket.getInputStream());

        // Lee el objeto Partida del servidor
        partida = (Partida) in.readObject();

        broker.añadirCliente(clientSocket);
        
        // Cierra el socket
        clientSocket.close();
    }

    public Cliente(Socket clientSocket) {
        this.clientSocket = clientSocket;
        try {
            this.out = new ObjectOutputStream(clientSocket.getOutputStream());
            this.in = new ObjectInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Cliente(Broker broker, int puerto) {
        this.broker = broker;
        this.puerto = puerto;
    }

//    public void enviarFicha(FichaJugador ficha) {
//        broker.enviarFicha(ficha);
//    }
//    
//    public void tomaPozo() {
//        broker.tomaPozo();
//    }
//    
//    public void pasarTurno() {
//        broker.pasarTurno();
//    }
//    
//    public void recibeFicha() {
//
//    }
//    
//    public void recibePozo() {
//        
//    }
//    
//    public void recibeTablero() {
//        
//    }
//    
//    public void recibeTurno() {
//        
//    }

    public Socket getClientSocket() {
        return clientSocket;
    }
   
    @Override
    public void run() {
        
    }

}
