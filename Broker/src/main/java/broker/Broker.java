/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.Partida;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Broker {
    
    List<Socket> clientes = new ArrayList();
    private Servidor servidor;
    private Partida partida;

    public Broker() throws IOException {
        this.servidor = new Servidor();
    }
    
    public void recibirPartida(Partida partida) throws IOException {
        servidor.iniciar(partida);
    }
    
    public ServerSocket getServer() {
        return servidor.getServer();
    }
    
//    public void enviarFicha(FichaJugador ficha) {
//        servidor.enviarFicha(ficha);
//        servidor.actTablero();
//    }
//    
//    public void tomaPozo() {
//        servidor.actPozo();
//        servidor.actTablero();
//    }
//    
//    public void pasarTurno() {
//        servidor.pasarTurno();
//        servidor.actTablero();
//    }
//    
//    public void mandaPozo() {
//        cliente.recibePozo();
//    }
//    
//    public void mandaFicha() {
//        cliente.recibeFicha();
//    }
//    
//    public void mandaTablero() {
//        cliente.recibeTablero();
//    }
//    
//    public void mandaTurno() {
//        cliente.pasarTurno();
//    }
    
    
}
