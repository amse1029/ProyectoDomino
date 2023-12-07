/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import dominio.Jugador;

import dominio.Partida;
import dominio.Pozo;
import dominio.Tablero;


/**
 *
 * @author usuario
 */
public class TableroModel implements ITableroModelS {
    
    Jugador jugador;
    Pozo pozo;
    MVPBroker broker;

    //Este metodo realiza la operacion colocar ficha
    public void colocaFicha() {
        broker.colocaFicha();
        jugador.restarFichasJugador();
        broker.actTablero();
        broker.cambiarTurnoB();
    }
    
    public void tomaPozo() {
        broker.tomaPozo();
        pozo.restarPozo();
        jugador.sumarFichasJugador();
        broker.cambiarTurnoB();
        broker.actTablero();
    }
    
    public void pasarTurno() {
        broker.cambiarTurnoB();
        broker.actTablero();
    }
 
    @Override
    public void getFichasTab(Tablero tablero) {
        
    }

    @Override
    public void getJugadores(Partida partida) {
        
    }

    @Override
    public void getCantPozo(Pozo pozo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
