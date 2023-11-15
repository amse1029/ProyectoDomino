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

    private String nombreInicio = "";
    private Jugador jugador= new Jugador(nombreInicio);
    
    
    public JugadorModel() {
    }

    public JugadorModel(String nombre) {
        this.jugador = new Jugador(nombre);
    }

    public boolean validarNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        for(char c: nombre.toCharArray()){
            if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                return false;
            }  
        }
        guardaJugador(nombre);
        System.out.println(jugador.getNombre());
        return true;        
    }
    
    public void guardaJugador(String name){
        jugador.setNombre(name);
    }
}
