/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import java.net.Socket;

/**
 *
 * @author alexa
 */
public class Cliente {
    
    private Socket socket;
    private Broker broker;
    private int puerto;

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
    
}
