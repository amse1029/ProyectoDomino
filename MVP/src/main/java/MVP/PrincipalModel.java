/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import DTO.PartidaDTO;
import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author alexa
 */
public class PrincipalModel {
    
    MVPBroker broker = new MVPBroker();
    
    public PartidaDTO getPartida() throws IOException {
        return broker.partidaIsClosed();
    }
}
