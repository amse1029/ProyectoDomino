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
public abstract class ConfPartidaPresenter implements IConfPartida {
    
    private FrmConfPartida frmConfPartida = new FrmConfPartida(this);
    private ConfPartidaModel model = new ConfPartidaModel(); 
    private JugadorPresenter jugadorPresenter = new JugadorPresenter();

    /**
     * Constructor por defecto
     */
    public ConfPartidaPresenter() {
    }

    public ConfPartidaPresenter(FrmConfPartida frmConfPartida, ConfPartidaModel model, JugadorPresenter jugadorPresenter) {
        this.frmConfPartida = frmConfPartida;
        this.jugadorPresenter = jugadorPresenter;
        this.model = model;
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
