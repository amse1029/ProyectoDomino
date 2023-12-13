/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import broker.Broker;
import broker.Servidor;
import dominio.Partida;
import java.io.IOException;

/**
 *
 * @author alexa
 */
public class MVPBroker {
    
    private Broker broker;

    public MVPBroker() {
        
    }
    
    public void recibirPartida(Partida partida) throws IOException {
        this.broker = new Broker();
        broker.recibirPartida(partida);
    }
    
    public void getClientesConectados() {
//        this.broker.getClientesConectados();
    }
 
//    public void hayPartida() {
//        
//    }
//    
//    public void actTablero() {
//        
//    }
//    
//    public void cambiarTurnoB() {
//        
//    }
//    
//    public void colocaFicha() {
//        
//    }
//    
//    public void tomaPozo() {
//        
//    }

    
    
}
