/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Partida;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Broker {
    
    private List<Cliente> clientes;
    private Cliente cliente;
    private Servidor servidor;
    private Partida partida;

    public Broker() {
        this.servidor = new Servidor();
    }
    
    public void recibirPartida(Partida partida) throws IOException {
        servidor.iniciar(partida);
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
