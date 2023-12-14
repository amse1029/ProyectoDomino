/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MVP;

import DTO.PeticionDTO;
import dominio.Jugador;
import dominio.Partida;

/**
 *
 * @author alexa
 */
public interface IMVPBroker {
    
    public PeticionDTO getPeticionDTO();
    public Partida getPartida();
    public Jugador getJugador();
}
