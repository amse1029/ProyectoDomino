/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmJugador;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author usuario
 */
public class JugadorPresenter implements IJugador, Observer {
    
    private ILobby lobbyPresenter = new LobbyPresenter();
    private FrmJugador frmJugador = new FrmJugador(this);
    private JugadorModel model = new JugadorModel();
    private String nombre = "";
    private String avatar = "";
    private boolean validar;

    public JugadorPresenter(ILobby lobbyPresenter) {
        this.lobbyPresenter = lobbyPresenter;
    }

    public JugadorPresenter() {
    }
    
    @Override
    public void selectIniciar() {
        nombre = frmJugador.getTxtNombre();
        avatar = frmJugador.getAvatar();
        validar = model.validarNombre(nombre, avatar);
        if (validar==false){
            msjError();
        }
        else {
            abrirPantallaLobby();
        }
    }
    
    @Override
    public void abrirPantallaJug() {
        frmJugador.abrirPantJugador();
    }
    
    public void msjError(){
        frmJugador.muestraMsjError();
    }
    
    @Override
    public void abrirPantallaLobby(){
        lobbyPresenter.abrirPantLobby();
    }

    @Override
    public void update(Observable o, Object arg) {
    }
}
