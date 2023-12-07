/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import GUI.FrmLobby;

/**
 *
 * @author alexa
 */
public class LobbyPresenter implements ILobby {

    private FrmLobby frmLobby = new FrmLobby(this);
    
    private volatile static LobbyPresenter instance;

    public static synchronized LobbyPresenter getInstance() {
        if (instance == null) {
            instance = new LobbyPresenter();
        }
        return instance;
    }
    
    @Override
    public void abrirPantLobby() {
        frmLobby.abrirPantLobby();
    }
    
}
