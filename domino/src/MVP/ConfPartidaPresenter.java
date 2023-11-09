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
    
    FrmConfPartida frmConfPartida = new FrmConfPartida(this);
    private ConfPartidaModel model = new ConfPartidaModel();

    public ConfPartidaPresenter() {
    }

    public ConfPartidaPresenter(FrmConfPartida frmConfPartida, ConfPartidaModel model) {
        this.frmConfPartida = frmConfPartida;
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
}
