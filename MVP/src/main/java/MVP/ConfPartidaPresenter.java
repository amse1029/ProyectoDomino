/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmConfPartida;

/**
 *
 * @author usuario
 */
public class ConfPartidaPresenter implements IConfPartida {
    
    private FrmConfPartida frmConfPartida = new FrmConfPartida(this);
    private ConfPartidaModel model = new ConfPartidaModel(); 
    IJugador jugadorPresenter = new JugadorPresenter();

    public ConfPartidaPresenter() {
    }
   
    public ConfPartidaPresenter(IJugador jugadorPresenter, ConfPartidaModel model) {
        this.jugadorPresenter = jugadorPresenter;
        this.model = model;
    }

    public ConfPartidaPresenter(IJugador jugadorPresenter) {
        this.jugadorPresenter = jugadorPresenter;
    }

    /**
     * Método que guarda la configuración de la partida
     * @param cantFichas Cantidad de fichas de la partida
     * @param cantJugadores Cantidad de jugadores de la partida
     */
    @Override
    public void selectGuardar(int cantFichas, int cantJugadores) {
        model.guardaConfiguracion(cantFichas, cantJugadores);
    }

    /**
     * Método que abre la pantalla de configuración de la partida
     */
    @Override
    public void abrirPantallaConf() {
        frmConfPartida.abrirPantConf();
    }
    
    /**
     * Método que abre la pantalla del jugador
     */
    @Override
    public void abrirPantallaJugador() {
        jugadorPresenter.abrirPantallaJug();
    }
}
