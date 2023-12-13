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
    private String avatarInicio = "";
    private Jugador jugador= new Jugador(nombreInicio, avatarInicio);
    MVPBroker broker = new MVPBroker();
    
    public JugadorModel() {
    }

    public JugadorModel(String nombre, String avatar) {
        this.jugador = new Jugador(nombre, avatar);
    }

    public boolean validarNombreAvatar(String nombre, String avatar){
        if(nombre == null || nombre.trim().isEmpty() || (avatar == "" || nombre.trim().isEmpty())){
            return false;
        }
        for(char c: nombre.toCharArray()){
            if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                return false;
            }  
        }
        guardaJugador(nombre, avatar);
        System.out.println(jugador.getNombre() + " " + jugador.getUrlAvatar());
        return true;        
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
        guardaJugadorNombre(nombre);
        System.out.println(jugador.getNombre());
        return true;        
    }
    
    public void guardaJugador(String name, String avatar){
        jugador.setNombre(name);
        jugador.setUrlAvatar(avatar);
    }
    
    public void guardaJugadorNombre(String name){
        jugador.setNombre(name);
    }
    
    public void getJugadoresPartida() {
        broker.getClientesConectados();
    }
}
