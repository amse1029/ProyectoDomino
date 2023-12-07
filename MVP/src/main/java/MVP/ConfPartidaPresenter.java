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
    IJugador jugadorPresenter;
   
    private volatile static ConfPartidaPresenter instance;

    public static synchronized ConfPartidaPresenter getInstance() {
        if (instance == null) {
            instance = new ConfPartidaPresenter();
        }
        return instance;
    }
   
    public ConfPartidaPresenter(ConfPartidaModel model) {
        this.jugadorPresenter = JugadorPresenter.getInstance();
        this.model = model;
    }

    private ConfPartidaPresenter() {
        
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
