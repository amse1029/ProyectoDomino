/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import dominio.FichaJugador;

import dominio.Partida;
import dominio.Tablero;
import interfaces.ITableroModelSFicha;
import interfaces.ITableroModelSPozo;


/**
 *
 * @author usuario
 */
public class TableroModel implements ITableroModelSFicha, ITableroModelSPozo {
    
    Partida partida;
    ITablero presenter;

    //Este metodo realiza la operacion colocar ficha
    public void colocaFicha() {
        partida.validaFicha();
    }
 
    //Se manda a llamar a la logica para validar si el pozo esta vacio
    public boolean validaPozo(){
        //EN CONSTRUCCIÓN
       return false;
    }
    public void cambiarTurno(){
        partida.cambiarTurno();
    }
    public void notificarCambioTurno(){}//EN CONSTRUCCION
    public void validaFicha(){}//EN CONSTRUCCION
    public void validaMano(){}//EN CONSTRUCCION
    
    public void actPantTableroFicha() {
        presenter.actPantallaTableroFicha();
    }
    
    public void actPantTableroPozo() {
        presenter.notificarCambioTurno();
        presenter.actPantallaTableroPozo();
    }
    
    public void tomaPozo() {
        partida.validaPozo();
    }

    @Override
    public void getFichasTab(Tablero tablero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getJugadores(Partida partida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getIJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getCantPozo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
