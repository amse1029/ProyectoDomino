/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import DTO.JugadorDTO;
import DTO.PartidaDTO;
import dominio.Jugador;
import dominio.Partida;


/**
 *
 * @author alexa
 */
public class Servidor{
     PartidaDTO partidaDTO;

    public Servidor() {
        this.partidaDTO = new PartidaDTO();
    }


   public void crearPartidaServidor(PartidaDTO partidaDTO){
       this.setPartida(partidaDTO);
   }

   public void agregarJugador(JugadorDTO jugadorDTO){
       this.partidaDTO.getJugadores().add(jugadorDTO);
   }
   
   public void unirsePartida(){
       
   }
    public PartidaDTO getPartida() {
        return partidaDTO;
    }

    public void setPartida(PartidaDTO partidaDTO) {
        this.partidaDTO = partidaDTO;
    }
   
   
}
