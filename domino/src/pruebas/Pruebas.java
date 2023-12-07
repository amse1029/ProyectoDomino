/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import MVP.ITablero;
import MVP.TableroModel;
import MVP.TableroPresenter;
import dominio.Tablero;

/**
 *
 * @author alexa
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        ITablero tablero = new TableroPresenter();
        tablero.abrirPantalla();
    }
    
}
