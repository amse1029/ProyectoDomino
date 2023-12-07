/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;


/**
 *
 * @author alexa
 */
public class Partida {
    
    private Jugador jugadores[];
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
    
    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
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
    
    //TODOS ESTOS METODOS SE VAN IMPLEMENTAR EN SUS RESPECTIVAS CLASES, AQUI
    //SOLO SE LLAMARAN
    //Este metodo va a validar la ficha que se quiere poner en el tablero si es 
    //valida o no para ponerse, por lo tanto recibe como parametro, la ficha que
    //se quiere validar y el tren de fichas de tablero
    //public boolean validaFicha(FichaJugador ficha, ArrayList<FichaTablero>){}
    //Este metodo va a validar la mano de jugador, por lo tanto recibe como parametro
    //un arraylist tipo FichaJugador

    @Override
    public String toString() {
        return "Partida{" + "cantFichas=" + cantFichas + ", cantJugadores=" + cantJugadores + '}';
    }
}
