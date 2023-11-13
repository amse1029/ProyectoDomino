/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Jugador;

/**
 *
 * @author alexa
 */
public interface IJugadorTurno {
    
    public void getNombre(Jugador jugador);
    public void getFichasJugador(Jugador jugador);
    public void getAvatar(Jugador jugador);
}
