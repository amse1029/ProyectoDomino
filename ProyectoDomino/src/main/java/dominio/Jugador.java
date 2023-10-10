/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author alexa
 */
public class Jugador {
    
    //avatar
    private String nombre;
    private FichaJugador fichas[];

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FichaJugador[] getFichas() {
        return fichas;
    }

    public void setFichas(FichaJugador[] fichas) {
        this.fichas = fichas;
    }
    
    
}
