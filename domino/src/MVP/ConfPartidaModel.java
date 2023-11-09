/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import dominio.Partida;

/**
 *
 * @author usuario
 */
public class ConfPartidaModel {

    private int cantFichas;
    private int cantJugadores;
    private Partida partida;

    public ConfPartidaModel() {
    }

    public ConfPartidaModel(int cantFichas, int cantJugadores) {
        this.cantFichas = cantFichas;
        this.cantJugadores = cantJugadores;
    }

    public ConfPartidaModel(Partida partida) {
        this.partida = partida;
    }
    
    public void guardaConfiguracion(int cantFichas, int cantJugadores) {
        partida.setCantFichas(cantFichas);
        partida.setCantJugadores(cantJugadores);
        System.out.println(partida);
    }
}
