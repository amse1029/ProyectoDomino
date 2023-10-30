/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Tablero {
 
    private FichaTablero fichasTablero;
    
    public Tablero() {
        this.fichasTablero= fichasTablero;
    }
    //Regresa la lista de fichas que estan en el tablero
    public FichaTablero getFichasTablero() {
        return fichasTablero;
    }
    //Se agrega la ficha del jugador al tablero
    public void setFichasTablero(Ficha ficha) {
        fichasTablero.fichas.add((FichaTablero) ficha);
   }
    //Este metodo verifica si se puede poner la ficha en un tablero
    //considerando que el tren de fichas se puede implementar con una cola
    public boolean validaFicha(){
        //EN CONSTRUCCIÓN
    return false;
}
    public void cambiaTurno(){}//EN CONSTRUCCION
    public void actTablero(){}//EN CONSTRUCCION
    
}
