/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmPrincipal;

/**
 *
 * @author usuario
 */
public class PrincipalPresenter implements IPrincipal {
    
    private IConfPartida presenterConfPartida = new ConfPartidaPresenter() {};
    private FrmPrincipal frmPrincipal = new FrmPrincipal(this);

    public PrincipalPresenter() {
    }

    public PrincipalPresenter(IConfPartida presenterConfPartida) {
        this.presenterConfPartida = presenterConfPartida;
    }

    @Override
    public void selectCrearPartida() {
        abrirPantPartida();
    }

    @Override
    public void abrirPantPartida() {
        presenterConfPartida.abrirPantallaConf();
    }

    @Override
    public void abrirPantPrincipal() {
        frmPrincipal.abrirPantalla();
    }
    
    

}
