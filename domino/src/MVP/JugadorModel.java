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
    private String nombreInicio = "";
    private Jugador jugadorInicio = new Jugador(nombreInicio);
    
    
    public JugadorModel() {
    }

    public JugadorModel(String nombre) {
        this.nombre = nombre;
    }

    public void validarNombre(String nombre){
        jugadorInicio.setNombre(nombre);
        nombre = jugadorInicio.getNombre();
        if(nombre != " "){
            guardarJugador();
            System.out.println(nombre);
        }
        else{
            
        }
    }
    
    public void guardarJugador(){
        jugadorInicio.setNombre(nombre);
    }
}
