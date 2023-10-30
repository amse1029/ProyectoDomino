/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import Graphics.DibujaFicha;
import dominio.Ficha;
import dominio.FichaJugador;
import dominio.FichaTablero;
import dominio.Jugador;
import dominio.Partida;
import dominio.Pozo;
import dominio.Tablero;

/**
 *
 * @author usuario
 */
public class TableroModel {
    Partida partida;

    public TableroModel() {
    }

    public TableroModel(Partida partida) {
        this.partida = partida;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    //Este metodo realiza la operacion colocar ficha
    public void colocaFicha(FichaJugador ficha) {
        //METODO EN CONSTRUCCION    
    }
 
    //Se manda a llamar a la logica para validar si el pozo esta vacio
    public boolean validaPozo(){
        //EN CONSTRUCCIÓN
       return false;
    }
    public void CambiarTurno(){}//EN CONSTRUCCION
    public void notificarCambioTurno(){}//EN CONSTRUCCION
    public void validaFicha(){}//EN CONSTRUCCION
    public void validaMano(){}//EN CONSTRUCCION
}
