/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author alexa
 */
public class PartidaDTO implements Serializable{
    private int cantJugadores;
    private int cantFichas;
    private List<JugadorDTO> jugadores;

    public PartidaDTO() {
      
    }

    public PartidaDTO(int cantJugadores, int cantFichas) {
        this.cantJugadores = cantJugadores;
        this.cantFichas = cantFichas;
    }

    public PartidaDTO(int cantFichas, List<JugadorDTO> jugadores) {
        this.cantFichas = cantFichas;
        this.jugadores = jugadores;
    }

    public PartidaDTO(int cantJugadores, int cantFichas, List<JugadorDTO> jugadores) {
        this.cantJugadores = cantJugadores;
        this.cantFichas = cantFichas;
        this.jugadores = jugadores;
    }

    public int getCantFichas() {
        return cantFichas;
    }

    public void setCantFichas(int cantFichas) {
        this.cantFichas = cantFichas;
    }

    public List<JugadorDTO> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<JugadorDTO> jugadores) {
        this.jugadores = jugadores;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    @Override
    public String toString() {
        return "PartidaDTO{" + "cantJugadores=" + cantJugadores + ", cantFichas=" + cantFichas + ", jugadores=" + jugadores + '}';
    }
    
}
