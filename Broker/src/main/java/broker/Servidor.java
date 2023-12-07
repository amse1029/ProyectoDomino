/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Partida;
import java.net.ServerSocket;

/**
 *
 * @author alexa
 */
public class Servidor {
    
    private ServerSocket server;
    private Broker broker;
    
    public void iniciar(Partida partida) {
        
    }
    
    public void enviarFicha(FichaJugador ficha) {
        broker.mandaFicha();
    }
    
    public void actPozo() {
        broker.mandaPozo();
    }
    
    public void actTablero() {
        broker.mandaTablero();
    }
    
    public void pasarTurno() {
        broker.mandaTurno();
    }
}
