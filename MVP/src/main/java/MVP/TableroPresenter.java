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
    public void colocaFicha(){
        tableroModel.colocaFicha();
    }
    
    @Override
    public void tomaPozo(){
        tableroModel.tomaPozo();
    }
    
    @Override
    public void pasarTurno(){
        tableroModel.cambiarTurno();
    }
    
    @Override
    public void notificarCambioTurno(){
        frmTablero.msjCambioTurno();
    }
    
    @Override
    public void actPantallaTableroFicha(){
        frmTablero.actPantallaTableroFicha();
    }
    
    @Override
    public void actPantallaTableroPozo(){
        frmTablero.actPantallaTableroPozo();
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
