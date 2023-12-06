/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmTablero;

/**
 *
 * @author usuario
 */
public class TableroPresenter implements ITablero{
    
    private FrmTablero frmTablero;
    private TableroModel tableroModel;

    public TableroPresenter() {
    }

    public TableroPresenter(TableroModel tableroModel) {
        this.tableroModel = tableroModel;
    }

    public TableroPresenter(FrmTablero frmTablero) {
        this.frmTablero = frmTablero;
    }

    public TableroPresenter(FrmTablero frmTablero, TableroModel tableroModel) {
        this.frmTablero = frmTablero;
        this.tableroModel = tableroModel;
    }
    
    @Override
    public void muestraMensajeError() {
        frmTablero.muestraMensajeError();
    }

    @Override
    public void msjCambioTurno() {
        frmTablero.msjCambioTurno();
    }
}
