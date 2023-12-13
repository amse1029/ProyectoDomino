/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import broker.Broker;
import dominio.Partida;
import java.io.IOException;

/**
 *
 * @author alexa
 */
public class MVPBroker {
    
    Broker broker = new Broker();
    
    public void recibirPartida(Partida partida) throws IOException {
        broker.recibirPartida(partida);
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
