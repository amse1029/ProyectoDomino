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
public class FichaTablero extends Ficha {
ArrayList <FichaTablero> fichas;

    public FichaTablero() {
        super();
        this.fichas=new ArrayList<>();
    }

    public ArrayList getFichasTablero() {
        return fichas;
    }

    public void setTablero(ArrayList<FichaTablero> fichas) {
        this.fichas=fichas;
    }
    
    
}
