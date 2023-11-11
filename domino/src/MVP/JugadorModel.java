/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import dominio.Jugador;


/**
 *
 * @author usuario
 */
public class JugadorModel {

    private String nombre;
    private Jugador jugador;
    
    public JugadorModel() {
    }

    public JugadorModel(String nombre) {
        this.nombre = nombre;
    }

    public void validarNombre(){
        nombre = jugador.getNombre();
        if(nombre != " "){
            guardarJugador();
        }
    }
    
    public void guardarJugador(){
        jugador.setNombre(nombre);
    }
}
