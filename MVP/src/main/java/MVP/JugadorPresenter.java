/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmJugador;
import dominio.Jugador;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class JugadorPresenter implements IJugador {
    
    private LobbyPresenter lobbyPresenter = new LobbyPresenter();
    private FrmJugador frmJugador = new FrmJugador(this);
    private JugadorModel model = new JugadorModel();
    
    public JugadorPresenter(){   
    }
    
    public JugadorPresenter(LobbyPresenter lobbyPresenter){
        this.lobbyPresenter = lobbyPresenter;
    }
    
    private String nombre = "";
    private boolean validar;

    @Override
    public void selectIniciar() {
        nombre = frmJugador.getTxtNombre();
        validar = model.validarNombre(nombre);
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
}
