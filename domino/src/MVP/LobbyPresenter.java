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

    private FrmLobby frmLobby;
    
    @Override
    public void abrirPantLobby() {
        frmLobby.abrirPantLobby();
    }
    
}
