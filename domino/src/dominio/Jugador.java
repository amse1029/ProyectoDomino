/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Jugador {
    
    private String nombre;
    private ArrayList <FichaJugador> fichas;

    public Jugador(String nombre, ArrayList<FichaJugador> fichas) {
        this.nombre = nombre;
        this.fichas = fichas;
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
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
    
        
}
