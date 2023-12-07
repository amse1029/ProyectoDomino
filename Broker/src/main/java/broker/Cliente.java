/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author alexa
 */
public class Cliente implements Runnable {
    
     private Socket clientSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private Broker broker;
    private int puerto;
    
    
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

    public void enviarFicha(FichaJugador ficha) {
        broker.enviarFicha(ficha);
    }
    
    public void tomaPozo() {
        broker.tomaPozo();
    }
    
    public void pasarTurno() {
        broker.pasarTurno();
    }
    
    public void recibeFicha() {

    }
    
    public void recibePozo() {
        
    }
    
    public void recibeTablero() {
        
    }
    
    public void recibeTurno() {
        
    }

    public Socket getClientSocket() {
        return clientSocket;
    }
    
    

    @Override
    public void run() {
        
    }
    
}
