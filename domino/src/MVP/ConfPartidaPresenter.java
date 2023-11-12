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

    public ConfPartidaPresenter() {
    }

    public ConfPartidaPresenter(FrmConfPartida frmConfPartida, ConfPartidaModel model, JugadorPresenter jugadorPresenter) {
        this.frmConfPartida = frmConfPartida;
        this.jugadorPresenter = jugadorPresenter;
        this.model = model;
    }

    @Override
    public void selectGuardar(int cantFichas, int cantJugadores) {
        model.guardaConfiguracion(cantFichas, cantJugadores);
    }

    @Override
    public void abrirPantallaConf() {
        frmConfPartida.abrirPantConf();
    }
    
    @Override
    public void abrirPantallaJugador() {
        jugadorPresenter.abrirPantallaJug();
    }
}
