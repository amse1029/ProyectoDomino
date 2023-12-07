/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dominio;

import dominio.Jugador;

/**
 *
 * @author alexa
 */
public interface IJugadorPartida {
    
    public void getNombre(Jugador jugador);
    public void getNumFichas(Jugador jugador);
    public void getAvatar(Jugador jugador);
    public void getFichasJugador(Jugador jugador);
    
}
