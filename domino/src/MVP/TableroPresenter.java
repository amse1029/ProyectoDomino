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
    FrmTablero frmTablero;
    TableroModel tableroModel;

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
    
    
    public void colocaFicha(){
        //EN CONSTRUCCION
    }
    public void tomaPozo(){
        //EN CONSTRUCCION
    }
    public void pasarTurno(){
        //EN CONSTRUCCION
    }
    public void notificarCambioTurno(){
        //EN CONSTRUCCION
    }
    public void actPantallaTablero(){
        //EN CONSTRUCCION
    }

    @Override
    public void muestraMensajeError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void msjCambioTurno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
