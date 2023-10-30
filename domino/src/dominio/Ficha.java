/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author alexa
 */
public class Ficha {
    private int espacio1;
    private int espacio2;

    public Ficha() {
    }

    public Ficha(int espacio1, int espacio2) {
        this.espacio1 = espacio1;
        this.espacio2 = espacio2;
    }

    public int getEspacio1() {
        return espacio1;
    }

    public void setEspacio1(int espacio1) {
        this.espacio1 = espacio1;
    }

    public int getEspacio2() {
        return espacio2;
    }

    public void setEspacio2(int espacio2) {
        this.espacio2 = espacio2;
    }
    public boolean esMula(int espacio1,int espacio2){
        if(espacio1==espacio2)
        return true;
        else
        return false;
    }
}
