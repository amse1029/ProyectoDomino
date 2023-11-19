/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import interfaces.IJugadorPartida;
import interfaces.IJugadorTurno;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Jugador implements IJugadorPartida, IJugadorTurno{
    
    private String nombre;
    private ArrayList <FichaJugador> fichas;
    private String urlAvatar;

    public Jugador(String nombre, ArrayList<FichaJugador> fichas, String urlAvatar) {
        this.nombre = nombre;
        this.fichas = fichas;
        this.urlAvatar = urlAvatar;
    }

    public Jugador(String nombre, String urlAvatar){
        this.nombre = nombre;
        this.urlAvatar = urlAvatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<FichaJugador>getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList <FichaJugador> fichas) {
        this.fichas = fichas;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
    
    public void restarFichasJugador(ArrayList<FichaJugador> fichas,Ficha fichaDelete){
        //EN CONSTRUCCION
        for(int i=0;i<fichas.size();i++){
            if(fichas.get(i)==fichaDelete){
                fichas.remove(i);
            }
        }
    }
    public void sumarFichasJugador(ArrayList<Ficha> fichas,Ficha fichaSum){
        //EN CONSTRUCCION
       fichas.add(fichaSum);
    }
    public void validarMano(){}//EN CONSTRUCCION
    public void tomarTurno(){}//EN CONSTRUCCION
    public void dibujarAvatar(){}//EN CONSTRUCCION

    @Override
    public void getNombre(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getNumFichas(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getAvatar(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getFichasJugador(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
