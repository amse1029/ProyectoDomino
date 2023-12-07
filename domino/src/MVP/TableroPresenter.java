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
    
    public void abrirPantalla(){
        frmTablero.abrirPantalla();
    }

    @Override
    public void colocaFicha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tomaPozo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pasarTurno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
