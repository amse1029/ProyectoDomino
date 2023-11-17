/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class FichaJugador extends Ficha {
    
  ArrayList <FichaJugador> fichasJugador;
   

    public FichaJugador() {
        super();
        this.fichasJugador=new ArrayList<>();
    }

    public ArrayList getFichasJugador() {
        return fichasJugador;
    }

    public void setFichasJugador(ArrayList <FichaJugador> fichas) {
        this.fichasJugador=fichas;
    }
    
    
}
