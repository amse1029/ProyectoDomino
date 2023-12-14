/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author alexa
 */
public class Partida implements Serializable {
    
    private List <String> jugadores;
    private Tablero tablero;
    private Pozo pozo;
    private int cantFichas;
    private int cantJugadores;

    public Partida() {
    }

    public Partida(int cantFichas, int cantJugadores) {
        this.cantFichas = cantFichas;
        this.cantJugadores = cantJugadores;
    }
    
    public List<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List <String> jugadores) {
        this.jugadores = jugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Pozo getPozo() {
        return pozo;
    }

    public void setPozo(Pozo pozo) {
        this.pozo = pozo;
    }

    public int getCantFichas() {
        return cantFichas;
    }

    public void setCantFichas(int cantFichas) {
        this.cantFichas = cantFichas;
    }
    
    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }
    
    public void enviarFicha() {
        
    }
    
    public void actTablero() {
        
    }
    
    public void actPozo() {
        
    }
    
    public void pasarTurno() {
        
    }

    @Override
    public String toString() {
        return "Partida{" + "cantFichas=" + cantFichas + ", cantJugadores=" + cantJugadores + '}';
    }
}
