/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmPrincipal;

/**
 *
 * @author 
 */
public class PrincipalPresenter implements IPrincipal {
    
    private IConfPartida presenterConfPartida;
    private FrmPrincipal frmPrincipal = new FrmPrincipal(this);
    
    private volatile static PrincipalPresenter instance;
     public static synchronized PrincipalPresenter getInstance() {
        if (instance == null) {
            instance = new PrincipalPresenter();
        }
        return instance;
    }

    public PrincipalPresenter() {
        this.presenterConfPartida = ConfPartidaPresenter.getInstance();
    }

    /**
     * Método que indica cuando el jugador selecciona "crear partida"
     */
    @Override
    public void selectCrearPartida() {
        abrirPantConf();
    }

    /**
     * Método que abre la pantalla de configuración de la partida
     */
    @Override
    public void abrirPantConf() {
        presenterConfPartida.abrirPantallaConf();
    }

    /**
     * Método que abre la pantalla principal
     */
    @Override
    public void abrirPantPrincipal() {
        frmPrincipal.abrirPantalla();
    }

}
