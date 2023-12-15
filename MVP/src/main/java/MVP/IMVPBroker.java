/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MVP;

import DTO.JugadorDTO;
import DTO.PartidaDTO;
import DTO.PeticionDTO;
import dominio.Jugador;
import dominio.Partida;
import java.net.ServerSocket;

/**
 *
 * @author alexa
 */
public interface IMVPBroker {
    
    public PeticionDTO getPeticionDTO();
    public PartidaDTO getPartida();
    public JugadorDTO getJugador();
    public PartidaDTO partidaIsClosed();
}
