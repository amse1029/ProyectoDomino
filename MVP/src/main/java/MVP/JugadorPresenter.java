/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import DTO.JugadorDTO;
import GUI.FrmJugador;
import dominio.Jugador;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author usuario
 */
public class JugadorPresenter implements IJugador{
    
    private ILobby lobbyPresenter = new LobbyPresenter();
    private FrmJugador frmJugador = new FrmJugador(this);
    private JugadorModel model = new JugadorModel();
    private JugadorDTO jugador = new JugadorDTO();
    private boolean validar;

    public JugadorPresenter(ILobby lobbyPresenter) {
        this.lobbyPresenter = lobbyPresenter;
    }

    public JugadorPresenter() {
    }
    
    @Override
    public void selectIniciar() {
        try{
        jugador.setNombre(frmJugador.getTxtNombre());
        validar = model.validarNombre(jugador.getNombre());
        if (validar==false){
            msjError();
        }
        else {
            //Se debe de abrir la pantalla ya actualizada
           model.guardaJugador(jugador.getNombre());
           
            abrirPantallaLobby();
        }
        }catch(Exception e){
            System.out.println(e);
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
  
     public String guardarNombre(String nombre) {
         nombre= frmJugador.getTxtNombre();
       return nombre;
   }
}
