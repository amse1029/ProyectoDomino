/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import dominio.Partida;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class ConfPartidaModel {

    MVPBroker broker = new MVPBroker();
    private int cantFichas;
    private int cantJugadores;
    private Partida partida;

    public ConfPartidaModel() {
        this.partida = new Partida();
    }

    public ConfPartidaModel(int cantFichas, int cantJugadores) {
        this.partida = new Partida();
        this.cantFichas = cantFichas;
        this.cantJugadores = cantJugadores;
    }

    public ConfPartidaModel(Partida partida) {
        this.partida = partida;
    }
    
    /**
     * Método que guarda la configuración de la partida
     * @param cantFichas Cantidad de fichas de la partida
     * @param cantJugadores Cantidad de jugadores en la partida
     */
    public void guardaConfiguracion(int cantFichas, int cantJugadores) throws IOException {
        partida.setCantFichas(cantFichas);
        partida.setCantJugadores(cantJugadores);
        System.out.println(partida);
        broker.recibirPartida(partida);
    }
}
