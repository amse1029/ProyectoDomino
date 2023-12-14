/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmJugador;
import dominio.Jugador;
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
    private Jugador jugador = new Jugador();
    private boolean validar;

    public JugadorPresenter(ILobby lobbyPresenter) {
        this.lobbyPresenter = lobbyPresenter;
    }

    public JugadorPresenter() {
    }
    
    @Override
    public void selectIniciar() {
        jugador.setNombre(frmJugador.getTxtNombre());
        validar = model.validarNombre(jugador.getNombre());
        if (validar==false){
            msjError();
        }
        else {
            //Se debe de abrir la pantalla ya actualizada
            model.actualizarLobbyCrearPartida(jugador);
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
    
     public String guardarNombre(String nombre) {
         nombre= frmJugador.getTxtNombre();
       return nombre;
   }
}
