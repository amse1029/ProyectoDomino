/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmPrincipal;
import java.net.ServerSocket;

/**
 *
 * @author 
 */
public class PrincipalPresenter implements IPrincipal {
    
    private IConfPartida presenterConfPartida = new ConfPartidaPresenter();
    private IJugador presenterJugador = new JugadorPresenter();
    private FrmPrincipal frmPrincipal = new FrmPrincipal(this, presenterJugador);
    PrincipalModel model = new PrincipalModel();
    
    public PrincipalPresenter() {
    }

    public PrincipalPresenter(IConfPartida presenterConfPartida) {
        this.presenterConfPartida = presenterConfPartida;
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

    @Override
    public void selectUnirsePartida() {
//        model.getServer();
    }
    
    @Override
    public ServerSocket verificarServer() {
        return model.getServer();
    }

}
