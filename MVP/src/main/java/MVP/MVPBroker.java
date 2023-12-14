/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import broker.Broker;
import dominio.Partida;
import java.io.IOException;
import java.net.ServerSocket;

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
    
    public ServerSocket getServer() throws IOException {
        this.broker = new Broker();
        return broker.getServer();
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
