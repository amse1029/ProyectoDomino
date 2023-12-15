/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author alexa
 */
public class PeticionDTO implements Serializable {
    
    private PartidaDTO partidaDTO;
    private JugadorDTO jugadorDTO;
    Peticiones peticion;

    public PeticionDTO(PartidaDTO partidaDTO, JugadorDTO jugadorDTO, Peticiones peticion) {
        this.partidaDTO = partidaDTO;
        this.jugadorDTO = jugadorDTO;
        this.peticion = peticion;
    }

    public PeticionDTO(Peticiones peticion) {
        this.peticion = peticion;
    }

    public PeticionDTO(JugadorDTO jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
    }

    public PeticionDTO(PartidaDTO partidaDTO) {
        this.partidaDTO = partidaDTO;
    }

    public PeticionDTO(Peticiones peticion, JugadorDTO jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
        this.peticion = peticion;
    }
    
    public PeticionDTO(Peticiones peticion, PartidaDTO partidaDTO) {
        this.peticion = peticion;
        this.partidaDTO = partidaDTO;
    }
    
    public PartidaDTO getPartidaDTO() {
        return partidaDTO;
    }

    public void setPartidaDTO(PartidaDTO partidaDTO) {
        this.partidaDTO = partidaDTO;
    }

    public JugadorDTO getJugadorDTO() {
        return jugadorDTO;
    }
   
    public void setJugadorDTO(JugadorDTO jugadorDTO) {
        this.jugadorDTO = jugadorDTO;
    }
    

    public Peticiones getPeticion() {
        return peticion;
    }

    public void setPeticion(Peticiones peticion) {
        this.peticion = peticion;
    }
    
}
