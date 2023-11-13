/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmJugador;
import dominio.Jugador;

/**
 *
 * @author usuario
 */
public class JugadorPresenter implements IJugador {
    
    private FrmJugador frmJugador = new FrmJugador(this);
    private JugadorModel model = new JugadorModel();
    private LobbyPresenter lobbyPresenter = new LobbyPresenter();
    
    private String nombre = "";

    @Override
    public void selectIniciar() {
        nombre = frmJugador.getTxtNombre();
        model.validarNombre(nombre);
        lobbyPresenter.abrirPantLobby();
    }
    
    @Override
    public void abrirPantallaJug() {
        frmJugador.abrirPantJugador();
    }
    
    public void msjError(){
        frmJugador.muestraMsjError();
    }
}
