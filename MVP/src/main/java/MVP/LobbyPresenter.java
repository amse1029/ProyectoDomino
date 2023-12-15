/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import GUI.FrmLobby;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class LobbyPresenter implements ILobby {

    private FrmLobby frmLobby = new FrmLobby(this);
    
    public LobbyPresenter() {
    }

    @Override
    public void abrirPantLobby() {
        frmLobby.abrirPantLobby();
    }

    @Override
    public List<String> getNombres() {
        try {
            LobbyModel model=new LobbyModel();
            return model.getNombres();
        } catch (IOException ex) {
            Logger.getLogger(LobbyPresenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   
    
    
}
