/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Partida;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Broker {
    
    private List<Cliente> clientes;
    private Servidor servidor;
    private Partida partida;

    public Broker() {
    }
    
    public void recibirPartida(Partida partida) {
        servidor.iniciar(partida);
    }
    
    public void recibeFicha(FichaJugador ficha) {
        servidor.enviarFicha(ficha);
        servidor.actTablero();
    }
    
    public void tomaPozo() {
        servidor.actPozo();
        servidor.actTablero();
    }
    
    public void pasarTurno() {
        servidor.pasarTurno();
        servidor.actTablero();
    }
}
