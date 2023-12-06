/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Partida;
import dominio.Pozo;
import dominio.Tablero;

/**
 *
 * @author alexa
 */
public interface ITableroModelS {
    
    public void getFichasTab(Tablero tablero);
    public void getJugadores(Partida partida);
    public void getCantPozo(Pozo pozo);
}
