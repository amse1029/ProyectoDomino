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
public class ConfPartidaPresenter implements IConfPartidaView{
    FrmConfPartida frmConfPartida;
    ConfPartidaModel model;

    public ConfPartidaPresenter(FrmConfPartida frmConfPartida, ConfPartidaModel model) {
        this.frmConfPartida = frmConfPartida;
        this.model = model;
    }

    @Override
    public void selectGuardar() {
        
    }

    @Override
    public boolean abrirPantallaConf() {
        return true;
    }
}
